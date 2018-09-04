package com.etiya.hms.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    private Date date_of_birth;
    private Gender gender;
    private String honorific;
    private String givenName;
    private String middleName;
    private String familyName;
    private String preferredName;
    private String motherMaidenName;
    private String suffix;
    private String ethnicity;
    private Set<PersonName> personNames=new HashSet<PersonName>();
}