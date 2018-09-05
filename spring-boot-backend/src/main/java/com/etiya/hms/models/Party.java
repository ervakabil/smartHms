package com.etiya.hms.models;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Document(collection = "par_party")
@TypeAlias("party.Party")
@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Party {
	
    private boolean canceled=false;

    private String code;

    private String shortName;
    
    private Person person;

    

}
