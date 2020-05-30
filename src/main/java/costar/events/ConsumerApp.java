package costar.events;

import com.google.protobuf.Any;
import costar.events.suite.property.DetailViewedOuterClass;
import io.confluent.demo.utils.ClientsUtils;
import org.apache.kafka.clients.consumer.*;

import java.util.Arrays;
import java.util.Properties;

import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;


public class ConsumerApp {

    public static void main(final String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Please provide command line arguments: configPath topic");
            System.exit(1);
        }

        final Properties props = ClientsUtils.loadConfig(args[0]);
        final String topic = args[1];

        // Add additional properties.
        props.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, EventEnvelopeOuterClass.EventEnvelope.class);

        props.put(ConsumerConfig.GROUP_ID_CONFIG, "costar-consumer-1");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer");


        KafkaProtobufDeserializer t;
        final Consumer<String, EventEnvelopeOuterClass.EventEnvelope> consumer = new KafkaConsumer<String, EventEnvelopeOuterClass.EventEnvelope>(props);
        consumer.subscribe(Arrays.asList(topic));

        Long total_count = 0L;

        try {
            while (true) {
                ConsumerRecords<String, EventEnvelopeOuterClass.EventEnvelope> records = consumer.poll(10);
                for (ConsumerRecord<String, EventEnvelopeOuterClass.EventEnvelope> record : records) {
                    String key = record.key();
                    EventEnvelopeOuterClass.EventEnvelope value = record.value();

                    Any any = value.getEvent();
                    DetailViewedOuterClass.DetailViewed detail = null;

                    if (any.is(DetailViewedOuterClass.DetailViewed.class))
                        detail = any.unpack(DetailViewedOuterClass.DetailViewed.class);


                    System.out.printf("Detail: " + detail);

                    total_count += 1;
                    System.out.printf("> v1 consumed record with value: %n%s%n", value);
                }
            }
        } finally {
            consumer.close();
        }
    }
}
