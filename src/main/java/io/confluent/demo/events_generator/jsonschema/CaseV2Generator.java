package io.confluent.demo.events_generator.jsonschema;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.jsonschema.CaseV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV2Generator {

    public static CaseV2 getNext(Random r) {

        Faker faker = new Faker();
        CaseV2 caseV2 = new CaseV2();

        caseV2.setCaseId(new Double(faker.number().randomNumber()));
        caseV2.setFirstName(faker.name().firstName());
        caseV2.setLastName(faker.name().lastName());
        caseV2.setAddress(faker.address().streetAddress() + " "
                + faker.address().country());
        caseV2.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<String> statusList = new ArrayList<>();
        statusList.add("E3");
        statusList.add("H1B");
        statusList.add("B1");
        statusList.add("B2");
        Collections.shuffle(statusList);
        caseV2.setImmigrationStatus(CaseV2.ImmigrationStatus.fromValue(statusList.get(0)));

        // a number
        caseV2.setaNumber(new Double(faker.number().randomNumber()));

        return caseV2;
    }
}