package io.confluent.demo.events_generator.protobuf;

import com.github.javafaker.Faker;
import io.confluent.demo.pojo.protobuf.CaseV3Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CaseV3Generator {

    public static CaseV3Impl.Case getNext(Random r) {

        Faker faker = new Faker();
        CaseV3Impl.Case.Builder caseV3 = CaseV3Impl.Case.newBuilder();

        caseV3.setCaseId(faker.number().randomNumber());
        caseV3.setName(faker.name().fullName());
        // String streetAddress = faker.address().streetAddress();
        caseV3.setAddress(faker.address().streetAddress());
        caseV3.setEmail(faker.internet().safeEmailAddress());

        // immigration status
        List<Integer> statusList = new ArrayList<>();
        statusList.add(0);
        statusList.add(1);
        statusList.add(2);
        statusList.add(3);
        Collections.shuffle(statusList);
        //String[] immigrationStatus = {"E3", "H1B", "B1", "B2"};
        caseV3.setImmigrationStatus(CaseV3Impl.Case.ImmigrationStatus.forNumber(statusList.get(0)));

        // A Number
        caseV3.setANumber(faker.number().randomDigit());

        return caseV3.build();
    }
}