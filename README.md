# Overview
This project was created to test the new Protobuf and JSON Schema support on [Confluent Cloud](https://www.confluent.io/confluent-cloud/?utm_source=github&utm_medium=demo&utm_campaign=ch.examples_type.community_content.clients-ccloud) and [Confluent Platform](http://packages.confluent.io/archive/5.5/confluent-5.5.0-2.12.tar.gz).

It includes the following:
* Order event schemas (with references) for Avro, Protobuf and JSON Schema.
* Java producers and consumers apps for Avro, Protobuf, JSON and generic events.
* CLI examples to produce and consume Avro, Protobuf, JSON and generic events. 
* REST Proxy examples to produce and consume Avro, Protobuf and JSON events.
* Kafka Streams apps with new serdes for Protobuf and JSON Schema.
* ksqlDB query examples for new formats Protobuf and JSON Schema.

# Prerequisites

* Java 1.8 or higher to run the demo application
* Maven to compile the demo application
* Access to a [Confluent Prod Cloud](https://confluent.cloud/login) cluster
* Access to a [Confluent Devel Cloud](https://devel.cpdev.cloud/login) cluster
* Access to a [Confluent Local Platform](http://localhost:9021/) cluster
* Property files located in './src/main/properties/' with clients information (including authentication credentials for Prod Cloud and Devel Cloud)

Example Cloud devel JSON Schema property file:\
```shell
$ cat .src/main/properties/config_cloud_devel_json.properties

# connect to cluster and pass credentials
bootstrap.servers=<BROKER ENDPOINT>
ssl.endpoint.identification.algorithm=https
security.protocol=SASL_SSL
sasl.mechanism=PLAIN
sasl.jaas.config=org.apache.kafka.common.security.plain.PlainLoginModule required username\="<API KEY>" password\="<API SECRET>";
retries=0
replication.factor=3
num.partitions=1

# connect to schema registry and pass credentials
schema.registry.url=<SR ENDPOINT>
basic.auth.credentials.source=USER_INFO
basic.auth.user.info=<KEY>:<SECRET>

key.serializer=org.apache.kafka.common.serialization.StringSerializer
value.serializer=io.confluent.kafka.serializers.json.KafkaJsonSchemaSerializer
key.deserializer=org.apache.kafka.common.serialization.StringDeserializer
value.deserializer=io.confluent.kafka.serializers.json.KafkaJsonSchemaDeserializer
type=JSON
```

# Use cases tested

* Java Produce/Consume for Avro messages (with reference schemas) 
* Java Produce/Consume for Protobuf messages (with reference schemas) 
* Java Produce/Consume for JSON Schema (with reference schemas) 
* Kafka Streams app for Protobuf 
* Kafka Streams app for JSON Schema
* REST Proxy Produce/Consume for Protobuf messages (with reference schemas)
* REST Proxy Produce/Consume for JSON messages (with reference schemas)
* Cloud CLI create, delete, describe for Protobuf schemas (with reference schemas)
* Cloud CLI create, delete, describe for JSON schemas (with reference schemas)
* CP CLI Produce/Consume for Protobuf messages (with reference schemas)\
    confluent local produce prototopic -- --value-format protobuf  --property value.schema.file=user.proto
* CP CLI Produce/Consume for JSON messages (with reference schemas)\
    confluent local produce jsontopic -- --value-format json  --property value.schema.file=user.json
* CLI kafka-protobuf-console Produce/Consume for Protobuf messages (with reference schemas)
* CLI kafka-json-console Produce/Consume for JSON messages (with reference schemas)
* Maven plugins to generate Java classes for Avro (with reference schemas)
* Maven plugins to generate Java classes for Protobuf (with reference schemas) 
* Maven plugins to generate Java classes for JSON (with reference schemas)
* Maven plugin to register Avro schemas  (with reference schemas)
* Maven plugin to register JSON schemas  (with reference schemas)

# Generate POJO from schemas

## JSON Schema
``
mvn jsonschema2pojo:generate
``
## Protobuf Schema
It was supposed to be:\
``
mvn protoc-jar:run
``\
But for some reason it does not output the generated classes to the correct library. So we need to use:\
``
mvn generate-test-sources 
``\
The catch here is that you cannot have any classes referencing this future generated classes since it give a compilation error.

# Gotchas

##Avro Schemas 
### Plugin
The Avro plugin will generate classes that un-nests all reference schemas and on produce register one extended schema.
```
<groupId>org.apache.avro</groupId>
<artifactId>avro-maven-plugin</artifactId>
<version>1.9.1</version>
```

##JSON Schemas 

### Plugin 
The JSON plugin will generate classes that un-nests all reference schemas and on produce register one extended schema.\
Ref: http://www.littlebigextra.com/how-to-convert-json-schema-to-java-classes-using-maven-plugin/
```
<groupId>org.jsonschema2pojo</groupId>
<artifactId>jsonschema2pojo-maven-plugin</artifactId>
<version>0.4.34</version>
```

##Protobuf Schemas

### Plugin
The Protobuf plugin will generate classes that on produce register the main schema and all reference schemas separately. 
```
<groupId>com.github.os72</groupId>
<artifactId>protoc-jar-maven-plugin</artifactId>
<version>3.11.1</version>
```

When using TopicNameStrategy: 
- main schema will follow the topic name convention, ie topic-value
- reference schemas will be automatically registered with the message name, eg Payment.proto when .proto is 
```
message Payment { 
    int32 payment_method_code = 1; 
    int64 card_number = 2;
    string expiration_date = 3;
    int32 cvv = 4;
}
```

Example of list schemas in SR:
```
[
  "Payment.proto",
  "protobuf_topic-value",
  "Customer.proto",
  "Product.proto"
]
```

When using RecordNameStrategy: 
- main schema is registered as namespace.message_name, e.g io.confluent.demo.generated_sources.protobuf.Order
- reference schemas will be automatically registered with the message name, eg Payment.proto when .proto is 

Example of list schemas in SR:
```
[
  "Payment.proto",
  "io.confluent.demo.generated_sources.protobuf.Order",
  "Customer.proto",
  "Product.proto"
]
```

## Run examples
Produce 1 Order Protobuf event:
```
mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.protobuf.ProducerExample" -Dexec.args="./src/main/properties/config_prem_protobuf.properties protobuf-java-app 1"
```
*** Size in bytes of Protobuf serialized object: 652

Produce 1 Order JSON event:
```
mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.jsonschema.ProducerExample" -Dexec.args="./src/main/properties/config_prem_json.properties json-java-app 1"
```
*** Size in bytes of JSON serialized object: 1607

Produce 1 Order Avro event:
```
mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.avro.ProducerExample" -Dexec.args="./src/main/properties/config_prem_avro.properties avro-java-app 300"
```
*** Size in bytes of Avro serialized object: 625


