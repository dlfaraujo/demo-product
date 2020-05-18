package io.confluent.demo.apps;

import io.confluent.demo.events_generator.EventGenerator;
import io.confluent.demo.utils.ClientsUtils;
import io.confluent.demo.utils.ColouredSystemOutPrintln;
import org.apache.kafka.clients.producer.*;

import java.io.IOException;
import java.util.Properties;

/**
 * <h1>Produce events to Kafka</h1>
 * The ProducerApp program implements an application that
 * allows you to produce records encoded in Avro, Protobuf or JSON to your
 * Kafka cluster running locally, on Confluent Cloud devel or on Confluent Cloud prod.
 * <pre>
 * <h2>AVRO</h2>
 * <b>CP LOCAL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources cp_local.properties topic-avro 10"
 * <b>CCLOUD DEVEL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_devel.properties topic-avro 10"
 * <b>CCLOUD PROD</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_prod.properties topic-avro 10"
 * <h2>PROTOBUF</h2>
 * <b>CP LOCAL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources cp_local.properties topic-protobuf 10"
 * <b>CCLOUD DEVEL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources ccloud_devel.properties topic-protobuf 10"
 * <b>CCLOUD PROD</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources ccloud_prod.properties topic-protobuf 10"
 * <h2>AVRO</h2>
 * <b>CP LOCAL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources cp_local.properties topic-avro 10"
 * <b>CCLOUD DEVEL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_devel.properties topic-avro 10"
 * <b>CCLOUD PROD</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_prod.properties topic-avro 10"
 * <h2>JSON SCHEMA</h2>
 * <b>CP LOCAL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources cp_local.properties topic-jsonschema 10"
 * <b>CCLOUD DEVEL</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources ccloud_devel.properties topic-jsonschema 10"
 * <b>CCLOUD PROD</b>:
 * mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources ccloud_prod.properties topic-jsonschema 10"
 * </pre>
 *
 * @author David Araujo
 * @version 1.0
 * @since 2020-04-09
 */
public class ProducerApp {

    /*  > AVRO ORDER
        CP LOCAL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources cp_local.properties topic-avro 10"
        CCLOUD DEVEL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_devel.properties topic-avro 10"
        CCLOUD PROD:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="avro ./src/main/resources ccloud_prod.properties topic-avro 10"

        > PROTOBUF ORDER
        CP LOCAL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources cp_local.properties topic-protobuf 10"
        CCLOUD DEVEL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources ccloud_devel.properties topic-protobuf 10"
        CCLOUD PROD:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="protobuf ./src/main/resources ccloud_prod.properties topic-protobuf 10"

        > JSON SCHEMA ORDER
        CP LOCAL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources cp_local.properties topic-jsonschema 10"
        CCLOUD DEVEL:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources ccloud_devel.properties topic-jsonschema 10"
        CCLOUD PROD:
           mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.OrderProducer" -Dexec.args="jsonschema ./src/main/resources ccloud_prod.properties topic-jsonschema 10"
     */

    /**
     * This is the main method which produces Order records to Kafka.
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
    public static void main(final String[] args) throws IOException {
        if (args.length < 5) {
            System.out.println("Please provide command line arguments: resourcesDir propertiesFile serializationType schema topicName <optional numberMessages>");
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
        Long numberMessages = new Long(10); // if not passed set 10 messages to send
        if (args.length == 6)
            numberMessages = new Long(args[5]);

        // Load properties file that contains Kafka and Schema Registry properties - cp_local.properties; ccloud_devel.properties; ccloud_prod.properties
        final Properties props = ClientsUtils.loadConfig(resourcesDir + "/" + propertiesFile);

        // Get serdes classes from serdes.properties
        Properties serdesProperties = ClientsUtils.loadConfig(resourcesDir + "/serdes.properties");

        // Key serializer class
        props.setProperty("key.serializer", serdesProperties.getProperty("string.serializer"));

        // Value serializer class
        props.setProperty("value.serializer", serdesProperties.getProperty(serializationType + ".serializer"));

        // if serialization format is jsonschema add the validation
        if (serializationType.equals("jsonschema"))
            props.setProperty("json.fail.invalid.schema","true");

        // Create a new topic if it doesn't exist
        int numPartitions = new Integer(props.getProperty("num.partitions"));
        int replicationFactor = new Integer(props.getProperty("replication.factor"));
        ClientsUtils.createTopic(topicName, numPartitions, replicationFactor, props);

        Producer<String, Object> producer = new KafkaProducer<String, Object>(props);

        long i = 0;
        String key = null;
        Object value;

        // Produce $numberMessages events given the $serializationType and $schema
        while (true) {
            if (i == numberMessages)
                break;
            else {
                if (numberMessages != -1) // if -1 produce forever
                    i++;

                // wait 1 second
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                // Generate data for the $serializationType and $schema
                value = EventGenerator.getEvent(serializationType, schema);

                Object finalValue = value;
                producer.send(new ProducerRecord<String, Object>(topicName, key, value), new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata m, Exception e) {
                        if (e != null) {
                            e.printStackTrace();
                        } else {
                            System.out.print(ColouredSystemOutPrintln.ANSI_BLACK + ColouredSystemOutPrintln.ANSI_BG_GREEN +
                                    "Producing record to topic " + m.topic() + " partition " + m.partition() + " [" + m.partition() + " ] @ offset " + m.offset() + ColouredSystemOutPrintln.ANSI_RESET);

                            // color the records depending on the schema name (for demo to highlight different schema versions)
                            if (schema.endsWith("V1"))
                                System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_BLUE);
                            else if (schema.endsWith("V2"))
                                System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_PURPLE);
                            else if (schema.endsWith("V3"))
                                System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_RED);
                            else
                                System.out.print("\n" + ColouredSystemOutPrintln.ANSI_WHITE + ColouredSystemOutPrintln.ANSI_BG_BLUE);

                            System.out.println(finalValue.toString() + ColouredSystemOutPrintln.ANSI_RESET);
                            //System.out.printf("*** Size in bytes of Avro serialized object: %s%n", m.serializedValueSize());
                        }
                    }
                });
            }
        }
        producer.flush();
        System.out.print(ColouredSystemOutPrintln.ANSI_BLACK + ColouredSystemOutPrintln.ANSI_BG_CYAN
                + "\n\n" + numberMessages + " messages were produced to topic " + topicName + "\n\n" + ColouredSystemOutPrintln.ANSI_RESET);
        producer.close();
    }
}