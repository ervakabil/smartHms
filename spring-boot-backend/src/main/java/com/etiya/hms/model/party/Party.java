package com.etiya.hms.model.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import com.etiya.hms.model.common.Footprint;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Document(collection = "par_party")
@TypeAlias("party.Party")
@Data
@EqualsAndHashCode(callSuper=false)
public class Party extends Footprint implements Serializable{
	
    private boolean canceled=false;

    private String code;
    
    private String shortName;
    
    private Person person;
    
    private List<Address> address=new ArrayList<Address>();
    
    private List<Contact> contact=new ArrayList<Contact>(); 
    
    private Organization organization;

    private Boolean completed = false;
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
}
