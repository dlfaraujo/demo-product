package io.confluent.demo.events_generator.protobuf;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.protobuf.CaseV2Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV2Generator {

    public static CaseV2Impl.Case getNext(Random r) {

        Faker faker = new Faker();
        CaseV2Impl.Case.Builder caseV2 = CaseV2Impl.Case.newBuilder();

        caseV2.setCaseId(faker.number().randomNumber());
        caseV2.setFirstName(faker.name().firstName());
        caseV2.setLastName(faker.name().lastName());
        // String streetAddress = faker.address().streetAddress();
        caseV2.setAddress(faker.address().streetAddress());
        caseV2.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<Integer> statusList = new ArrayList<>();
        statusList.add(0);
        statusList.add(1);
        statusList.add(2);
        statusList.add(3);
        Collections.shuffle(statusList);
        //String[] immigrationStatus = {"E3", "H1B", "B1", "B2"};
        caseV2.setImmigrationStatus(CaseV2Impl.Case.ImmigrationStatus.forNumber(statusList.get(0)));

        // A Number
        caseV2.setANumber(faker.number().randomDigit());

        return caseV2.build();
    }
}