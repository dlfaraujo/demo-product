package io.confluent.demo.events_generator.protobuf;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.jsonschema.CaseV1;
import io.confluent.demo.pojo.protobuf.CaseV1Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BenchmarkCaseGenerator {

    public static CaseV1Impl.Case getNext(Random r) {


        CaseV1Impl.Case.Builder caseV1 = CaseV1Impl.Case.newBuilder();

        caseV1.setCaseId(12345);
        caseV1.setFirstName("David");
        caseV1.setLastName("Araujo");
        caseV1.setAddress("Mountain View CA");
        caseV1.setEmail("daraujo@confluent.io");
        caseV1.setImmigrationStatusValue(0);

        return caseV1.build();
    }
}