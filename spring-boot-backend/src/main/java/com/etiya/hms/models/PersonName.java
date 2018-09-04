package com.etiya.hms.models;

import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PersonName {
    private String honorific;
    private String givenName;
    private String middleName;
    private String familyName;
    private String preferredName;
    private String motherMaidenName;
    private String suffix;
    private Date validFrom;
    private Date validThru;
    private String comment;
    private String nameUse;
}