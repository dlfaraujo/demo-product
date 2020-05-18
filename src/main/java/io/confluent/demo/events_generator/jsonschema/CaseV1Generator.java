package io.confluent.demo.events_generator.jsonschema;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.jsonschema.CaseV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV1Generator {

    public static CaseV1 getNext(Random r) {

        Faker faker = new Faker();
        CaseV1 caseV1 = new CaseV1();

        caseV1.setCaseId(new Double(faker.number().randomNumber()));
        caseV1.setFirstName(faker.name().firstName());
        caseV1.setLastName(faker.name().lastName());
        caseV1.setAddress(
                          faker.address().streetAddress() + " "
                        + faker.address().country());
        caseV1.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<String> statusList = new ArrayList<>();
        statusList.add("E3");
        statusList.add("H1B");
        statusList.add("B1");
        statusList.add("B2");
        Collections.shuffle(statusList);
        caseV1.setImmigrationStatus(CaseV1.ImmigrationStatus.fromValue(statusList.get(0)));

        return caseV1;
    }
}