package io.confluent.demo.events_generator.avro;

import io.confluent.demo.pojo.avro.*;
import io.confluent.demo.pojo.protobuf.CaseV1Impl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BenchmarkCaseGenerator {

    public static Case getNext(Random r) {

        Case caseV1 = new Case();

        caseV1.setCaseId(12345);
        caseV1.setFirstName("David");
        caseV1.setLastName("Araujo");
        caseV1.setAddress("Mountain View CA");
        caseV1.setEmail("daraujo@confluent.io");
        caseV1.setImmigrationStatus(ImmigrationStatus.E3);

        return caseV1;
    }
}