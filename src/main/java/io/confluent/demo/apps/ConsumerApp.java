package io.confluent.demo.apps;

/**
 * Copyright 2019 Confluent Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import io.confluent.demo.utils.ClientsUtils;
import io.confluent.demo.utils.ColouredSystemOutPrintln;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.serializers.json.KafkaJsonSchemaDeserializerConfig;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import org.apache.kafka.clients.consumer.*;

import java.util.Arrays;
import java.util.Properties;

public class ConsumerApp {

    /*
    Run on cp local:
    mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ConsumerApp" -Dexec.args="./src/main/resources cp_local.properties protobuf order topic-protobuf"

    run on devel:
    */

    /**
     * This is the main method which consumers records from Kafka.
     *
     * @param args    resourcesDir propertiesFile serializationType schema topicName numberMessages
     * @param args[0] The resources directory.
     * @param args[1] The properties filename.
     * @param args[2] The serialization format to use. Can be avro, protobuf, jsonschema or string.
     * @param args[3] The name of the schema to use.
     * @param args[4] The name of the topic to produce to.
     * @param args[5] The number of message to produce.
     * @return Nothing.
     */
    public static void main(final String[] args) throws Exception {

        if (args.length < 5) {
            System.out.println("Please provide command line arguments: resourcesDir propertiesFile serializationType schema topicName");
            System.exit(1);
        }

        // Read the main arguments
        String resourcesDir = args[0];
        String propertiesFile = args[1];
        String serializationType = args[2];
        if (!serializationType.matches("avro|protobuf|jsonschema|string")) {
            System.err.println("Invalid serialization format, use avro or protobuf or jsonschema or string");
            System.exit(1);
        }
        String schema = args[3];
        String topicName = args[4];

        // Load properties file that contains Kafka and Schema Registry properties - cp_local.properties; ccloud_devel.properties; ccloud_prod.properties
        final Properties props = ClientsUtils.loadConfig(resourcesDir + "/" + propertiesFile);

        // Get serdes classes from serdes.properties
        Properties serdesProperties = ClientsUtils.loadConfig(resourcesDir + "/serdes.properties");
        // Key deserializer class
        props.setProperty("key.deserializer", serdesProperties.getProperty("string.deserializer"));
        // Value deserializer class
        props.setProperty("value.deserializer", serdesProperties.getProperty(serializationType + ".deserializer"));

        // Get the POJO class from schemaGenSources.properties
        Properties pojoProperties = ClientsUtils.loadConfig(resourcesDir + "/pojo.properties");
        // POJO class
        String pojo = pojoProperties.getProperty(serializationType + "." + schema);

        switch (serializationType) {
            case "avro":
                props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
            case "protobuf":
                Class pojoClass = Class.forName(pojo);
                // get the inner class of the generated Protobuf outer class
                Class<?> innerPojoClass = pojoClass.getDeclaredClasses()[0];
                props.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, innerPojoClass);
            case "jsonschema":
                props.setProperty("json.fail.invalid.schema","true");
                props.put(KafkaJsonSchemaDeserializerConfig.JSON_VALUE_TYPE, pojo);
        }

        props.put(ConsumerConfig.GROUP_ID_CONFIG, "demo-consumer-" + serializationType + "_" + schema + "-1");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        final Consumer<String, Object> consumer = new KafkaConsumer<String, Object>(props);
        consumer.subscribe(Arrays.asList(topicName));

        Long total_count = 0L;

        try {
            while (true) {
                ConsumerRecords<String, Object> records = consumer.poll(10);
                for (ConsumerRecord<String, Object> record : records) {
                    String key = record.key();
                    Object value = record.value();
                    total_count += 1;

                    System.out.print(ColouredSystemOutPrintln.ANSI_BLACK + ColouredSystemOutPrintln.ANSI_BG_GREEN +
                            "Consuming record " + total_count + ColouredSystemOutPrintln.ANSI_RESET);

                    // color the records depending on the schema name (for demo to highlight different schema versions)
                    if (schema.endsWith("V1"))
                        System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_BLUE);
                    else if (schema.endsWith("V2"))
                        System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_PURPLE);
                    else if (schema.endsWith("V3"))
                        System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_RED);
                    else
                        System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_BLUE);

                    System.out.println(value + ColouredSystemOutPrintln.ANSI_RESET);
                }
            }
        } finally {
            consumer.close();
        }
    }
}
