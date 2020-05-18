package io.confluent.demo.events_generator.jsonschema;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.jsonschema.CaseV3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV3Generator {

    public static CaseV3 getNext(Random r) {

        Faker faker = new Faker();
        CaseV3 caseV3 = new CaseV3();

        caseV3.setCaseId(new Double(faker.number().randomNumber()));
        faker.number().randomNumber(10, false);
        caseV3.setName(faker.name().name());
        caseV3.setAddress(
                faker.address().streetAddress() + " "
                        + faker.address().country());
        caseV3.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<String> statusList = new ArrayList<>();
        statusList.add("E3");
        statusList.add("H1B");
        statusList.add("B1");
        statusList.add("B2");
        Collections.shuffle(statusList);
        caseV3.setImmigrationStatus(CaseV3.ImmigrationStatus.fromValue(statusList.get(0)));

        // a number
        caseV3.setaNumber(new Double(faker.number().randomNumber()));

        return caseV3;
    }
}