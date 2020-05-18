#!/bin/bash

# shell fonts
NONE='\033[00m'
RED='\033[01;31m'
GREEN='\033[01;32m'
YELLOW='\033[01;33m'
PURPLE='\033[01;35m'
CYAN='\033[01;36m'
WHITE='\033[01;37m'
BOLD='\033[1m'
UNDERLINE='\033[4m'

# project properties
project_dir=/Users/daraujo/code-workspace/demo-product
properties_dir=./src/main/resources
schemas_dir=./src/main/resources/schemas
cp_local=cp_local.properties
ccloud_devel=ccloud_devel.properties
ccloud_prod=ccloud_prod.properties
format=""
location=""

function chooseFormat
{
 option=0
 printf "Choose the data serialization format: \n"
 until [ "$option" = "4" ]; do
 echo "  1.) JSON"
 echo "  2.) Protobuf"
 echo "  3.) Avro"
 echo "  4.) Return to menu"

 echo -n "Enter choice: "
 read option
 echo ""
 case $option in
 1 ) format="jsonschema"; extension=".json"; return ;;
 2 ) format="protobuf";extension=".proto"; return ;;
 3 ) format="avro"; extension=".avsc"; return ;;
 4 ) main_menu; return ;;
 5 ) break ;;
 * ) tput setf 3;echo "Please enter 1, 2, 3 or 4";tput setf 4;
 esac
 done
}

function chooseLocation
{
 option=0
 printf "Choose the Kafka cluster: \n"
 until [ "$option" = "4" ]; do
 echo "  1.) Confluent Platform on localhost"
 echo "  2.) Confluent Cloud on devel"
 echo "  3.) Confluent Cloud on production"
 echo "  4.) Return to menu"

 echo -n "Enter choice: "
 read option
 echo ""
 case $option in
 1 ) location="cp_local"; return ;;
 2 ) location="ccloud_devel";return ;;
 3 ) location="ccloud_prod"; return ;;
 4 ) main_menu; return ;;
 5 ) break ;;
 * ) tput setf 3;echo "Please enter 1, 2, 3 or 4";tput setf 4;
 esac
 done
}

function chooseSchema
{
 option=0
 printf "Choose the schema to use: \n"
 until [ "$option" = "6" ]; do
 echo "  1.) caseV1"
 echo "  2.) caseV2"
 echo "  3.) caseV3"
 echo "  4.) order"
 echo "  5.) benchmark"
 echo "  6.) Return to menu"

 echo -n "Enter choice: "
 read option
 echo ""
 case $option in
 1 ) printf ${GREEN}; cat $schemas_dir/$format/caseV1$extension; printf "${NONE} \n"; schema="caseV1"; return ;;
 2 ) printf ${GREEN}; cat $schemas_dir/$format/caseV2$extension; printf "${NONE} \n"; schema="caseV2"; return ;;
 3 ) printf ${GREEN}; cat $schemas_dir/$format/caseV3$extension; printf "${NONE} \n"; schema="caseV3"; return ;;
 4 ) printf ${GREEN}; cat $schemas_dir/$format/order$extension; printf "${NONE} \n"; schema="order"; return ;;
 5 ) schema="benchmark"; return ;;
 6 ) main_menu; return ;;

 * ) tput setf 3;echo "Please enter 1, 2, 3, 4 or 5";tput setf 5;
 esac
 done
}

function produce
{
 printf "Name of topic: "
 read topicName

 printf "Number of messages: "
 read numMessages

 echo ""
 # resourcesDir propertiesFile serializationType schema topicName numberMessages
 case $location in
 cp_local ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ProducerApp" -Dexec.args="$properties_dir $cp_local $format $schema $topicName $numMessages" ;;
 ccloud_devel ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ProducerApp" -Dexec.args="$properties_dir $ccloud_devel $format $schema $topicName $numMessages" ;;
 ccloud_prod ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ProducerApp" -Dexec.args="$properties_dir $ccloud_prod $format $schema $topicName $numMessages" ;;
 esac
}

function consume
{
 printf "Name of topic: "
 read topicName

 echo ""
 # resourcesDir propertiesFile serializationType schema topicName
 case $location in
 cp_local ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ConsumerApp" -Dexec.args="$properties_dir $cp_local $format $schema $topicName" ;;
 ccloud_devel ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ConsumerApp" -Dexec.args="$properties_dir $ccloud_devel $format $schema $topicName" ;;
 ccloud_prod ) cd $project_dir; mvn exec:java -Dexec.mainClass="io.confluent.demo.apps.ConsumerApp" -Dexec.args="$properties_dir $ccloud_prod $format $schema $topicName" ;;
 esac
}

function shortcuts
{
 option=0
 printf "Choose shortcut: \n"
 printf "mvn exec:java -Dexec.mainClass=\"io.confluent.demo.apps.ProducerApp\n"
 until [ "$option" = "4" ]; do
 echo "  1.) AVRO cp local: -Dexec.args=$properties_dir $cp_local avro order order-avro-topic 100"
 echo "  2.) AVRO ccloud devel: -Dexec.args=$properties_dir $ccloud_devel avro order order-avro-topic 100"
 echo "  3.) AVRO ccloud prod: -Dexec.args=$properties_dir $ccloud_prod avro order order-avro-topic 100"
 echo "  4.) PROTOBUF cp local: -Dexec.args=$properties_dir $cp_local protobuf order order-protobuf-topic 100"
 echo "  5.) PROTOBUF ccloud devel: -Dexec.args=$properties_dir $ccloud_devel protobuf order order-protobuf-topic 100"
 echo "  6.) PROTOBUF ccloud prod: -Dexec.args=$properties_dir $ccloud_prod protobuf order order-protobuf-topic 100"
 echo "  7.) JSON SCHEMA cp local: -Dexec.args=$properties_dir $cp_local jsonschema order order-jsonschema-topic 100"
 echo "  8.) JSON SCHEMA ccloud devel: -Dexec.args=$properties_dir $ccloud_devel jsonschema order order-jsonschema-topic 100"
 echo "  9.) JSON SCHEMA ccloud prod: -Dexec.args=$properties_dir $ccloud_prod jsonschema order order-jsonschema-topic 100"
 echo "  10.) Return to menu"

 echo -n "Enter choice: "
 read option
 echo ""
 case $option in
 1 ) location="cp_local"; return ;;
 2 ) location="ccloud_devel"; return ;;
 3 ) location="ccloud_prod"; return ;;
 4 ) main_menu; return ;;
 5 ) break ;;
 * ) tput setf 3;echo "Please enter 1, 2, 3 or 4";tput setf 4;
 esac
 done
}


function main_menu
{
option=0
until [ "$option" = "4" ]; do
echo "  1.) Produce"
echo "  2.) Consume"
echo "  3.) Shortcuts"
echo "  4.) Quit"

echo -n "Enter choice: "
read option
echo ""
case $option in
    1 ) chooseFormat; chooseSchema; chooseLocation; produce ;;
    2 ) chooseFormat; chooseSchema; chooseLocation; consume ;;
    3 ) shortcuts;;
    4 ) exit;;
    * ) tput setf 4;echo "Please enter 1, 2, 3 or 4";tput setf 3;
esac
done
 }

main_menu