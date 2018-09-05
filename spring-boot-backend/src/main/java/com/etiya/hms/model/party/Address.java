package com.etiya.hms.model.party;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.etiya.hms.model.basic.Country;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Address {    
    private String streetName;
    private String additionalStreetName;
    private String blockName;
    private String buildingName;
    private String buildingNumber;
    private String postbox;
    private String floor;
    private String room;
    private String inHouseMail;
    private String department;
    private String markAttention;
    private String markCare;
    private String plotIdentification;
    private String citySubdivision_name;
    private String cityName;
    private String postalZone;
    private String countrySubentity;
    private String countrySubentityCode;
    private String region;
    private String district;
    private String timezoneOffset;
    // TODO - fare campo che diventa un arrey tramite Conversion
    private int pos[] = new int[2];

    @DBRef(lazy = true)
    private Country country;
    
    private AddressType addressType;


}