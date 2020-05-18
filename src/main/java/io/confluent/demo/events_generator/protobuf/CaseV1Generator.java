package io.confluent.demo.events_generator.protobuf;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.protobuf.CaseV1Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV1Generator {

    public static CaseV1Impl.Case getNext(Random r) {

        Faker faker = new Faker();
        CaseV1Impl.Case.Builder caseV1 = CaseV1Impl.Case.newBuilder();

        caseV1.setCaseId(faker.number().randomNumber());
        caseV1.setFirstName(faker.name().firstName());
        caseV1.setLastName(faker.name().lastName());
        // String streetAddress = faker.address().streetAddress();
        caseV1.setAddress(faker.address().streetAddress());
        caseV1.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<Integer> statusList = new ArrayList<>();
        statusList.add(0);
        statusList.add(1);
        statusList.add(2);
        statusList.add(3);
        Collections.shuffle(statusList);
        //String[] immigrationStatus = {"E3", "H1B", "B1", "B2"};
        caseV1.setImmigrationStatus(CaseV1Impl.Case.ImmigrationStatus.forNumber(statusList.get(0)));

        return caseV1.build();
    }
}