package costar.events;

import com.google.protobuf.Any;
import costar.events.suite.property.DetailViewedOuterClass;
import io.confluent.demo.events_generator.EventGenerator;
import io.confluent.demo.pojo.protobuf.PaymentEventV1;
import io.confluent.demo.utils.ClientsUtils;
import io.confluent.demo.utils.ColouredSystemOutPrintln;
import org.apache.kafka.clients.producer.*;

import java.io.IOException;
import java.time.Instant;
import java.util.Properties;
import java.util.Random;

public class ProducerApp {

    // mvn exec:java -Dexec.mainClass="costar.events.ProducerApp" -Dexec.args="./src/main/resources/cp_local.properties"
    public static void main(final String[] args) throws IOException {

        int numArgs = args.length;

        // Read the main arguments
        String propertiesFile = args[0];

        // Load properties file that contains Kafka and Schema Registry properties - cp_local.properties; ccloud_devel.properties; ccloud_prod.properties
        final Properties props = ClientsUtils.loadConfig(propertiesFile);

        // Key serializer class
        props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Value serializer class
        props.setProperty("value.serializer", "io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer");

        // Create a new topic if it doesn't exist
        int numPartitions = new Integer(props.getProperty("num.partitions"));
        int replicationFactor = new Integer(props.getProperty("replication.factor"));
        ClientsUtils.createTopic("costar", numPartitions, replicationFactor, props);

        // generate costar event
        EventEnvelopeOuterClass.EventEnvelope.Builder record = EventEnvelopeOuterClass.EventEnvelope.newBuilder();
        record.setTimestamp(121232323);

        DetailViewedOuterClass.DetailViewed.Builder detailedViewed = DetailViewedOuterClass.DetailViewed.newBuilder();
        detailedViewed.setPropertyId(122);
        detailedViewed.setTabName("david");
        detailedViewed.setTabId(1212);
        detailedViewed.setSubTabId(565556);
        Any anyMessage = Any.pack(detailedViewed.build());

        record.setEvent(anyMessage);

        System.out.println("event 2: " + record.build());

        // produce envelop event
        Producer<String, EventEnvelopeOuterClass.EventEnvelope> producer = new KafkaProducer<String, EventEnvelopeOuterClass.EventEnvelope>(props);
        //Producer<String, PaymentEventV1.PaymentEvent> producer = new KafkaProducer<String, PaymentEventV1.PaymentEvent>(props);

        /*
        PaymentEventV1.PaymentEvent.Builder record = PaymentEventV1.PaymentEvent.newBuilder();

        Random rnd = new Random();
        long i = 0;

        // *** Random Payment event generation
        // set id
        record.setId(rnd.nextInt(1000000));
        // set timestamp
        record.setEpoch(Instant.now().toEpochMilli());
        // set status
        record.setSuccess(true);
        // set amount
        double start = 10;
        double end = 1000;
        double randomAmount = rnd.nextDouble();
        double amount = start + (randomAmount * (end - start));
        record.setAmount(amount);
        // set cardNumber
        if ( ((i%2)==0)) // even
            record.setPaymentType("visa");
        else // odd
            record.setPaymentType("amex");

        String key=null;

        producer.send(new ProducerRecord<String, PaymentEventV1.PaymentEvent>("costar", key, record.build()), new Callback() {
         */

        String key=null;

        producer.send(new ProducerRecord<String, EventEnvelopeOuterClass.EventEnvelope>("costar1", key, record.build()), new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata m, Exception e) {
                        if (e != null) {
                            e.printStackTrace();
                        } else {
                            System.out.print(ColouredSystemOutPrintln.ANSI_BLACK + ColouredSystemOutPrintln.ANSI_BG_GREEN +
                                    "Producing record to topic " + m.topic() + " partition " + m.partition() + " [" + m.partition() + " ] @ offset " + m.offset() + ColouredSystemOutPrintln.ANSI_RESET);
                       }
                    }
                });
        producer.flush();
        producer.close();
    }
}