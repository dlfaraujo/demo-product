package io.confluent.demo.events_generator.jsonschema;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.jsonschema.CaseV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BenchmarkCaseGenerator {

    public static CaseV1 getNext(Random r) {

        CaseV1 caseV1 = new CaseV1();

        caseV1.setCaseId(new Double(12345));
        caseV1.setFirstName("David");
        caseV1.setLastName("Araujo");
        caseV1.setAddress("Mountain View CA");
        caseV1.setEmail("daraujo@confluent.io");
        caseV1.setImmigrationStatus(CaseV1.ImmigrationStatus.E_3);

        return caseV1;
    }
}