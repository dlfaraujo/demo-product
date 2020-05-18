package io.confluent.demo.events_generator;

import io.confluent.demo.pojo.protobuf.CaseV1Impl;

import java.util.Random;

public class EventGenerator {

    public static Object getEvent(String serializationType, String schema) {

        Random rnd = new Random();

        switch (serializationType) {
            case "avro":

                switch (schema) {
                    case "order":
                        return io.confluent.demo.events_generator.avro.OrderGenerator.getNext(rnd);
                    case "benchmark":
                        return io.confluent.demo.events_generator.avro.BenchmarkCaseGenerator.getNext(rnd);
                }

            case "protobuf":
                switch (schema) {
                    case "order":
                        return io.confluent.demo.events_generator.protobuf.OrderGenerator.getNext(rnd);
                    case "caseV1":
                        return io.confluent.demo.events_generator.protobuf.CaseV1Generator.getNext(rnd);
                    case "caseV2":
                        return io.confluent.demo.events_generator.protobuf.CaseV2Generator.getNext(rnd);
                    case "caseV3":
                        return io.confluent.demo.events_generator.protobuf.CaseV3Generator.getNext(rnd);
                    case "benchmark":
                        return io.confluent.demo.events_generator.protobuf.BenchmarkCaseGenerator.getNext(rnd);
                }

            case "jsonschema":
                switch (schema) {
                    case "order":
                        return io.confluent.demo.events_generator.jsonschema.OrderGenerator.getNext(rnd);
                    case "caseV1":
                        return io.confluent.demo.events_generator.jsonschema.CaseV1Generator.getNext(rnd);
                    case "caseV2":
                        return io.confluent.demo.events_generator.jsonschema.CaseV2Generator.getNext(rnd);
                    case "caseV3":
                        return io.confluent.demo.events_generator.jsonschema.CaseV3Generator.getNext(rnd);
                    case "benchmark":
                        return io.confluent.demo.events_generator.jsonschema.BenchmarkCaseGenerator.getNext(rnd);
                }

            case "string":
                return rnd.nextLong();

            default:
                return "";
        }
    }
}
