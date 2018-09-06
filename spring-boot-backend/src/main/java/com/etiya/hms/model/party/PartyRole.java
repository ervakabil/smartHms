package com.etiya.hms.model.party;

import java.util.Date;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import com.etiya.hms.model.common.Footprint;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 04/01/15
 * Time: 19:43
 */
@Document(collection = "par_partyrole")
@TypeAlias("party.PartyRole")
@Data
//@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PartyRole extends Footprint {
    /**
     * The status (canceled/not canceled) of the party role;
     */
    private boolean canceled=false;

    /**
     * The status (freezed/not freezed) of the party role;
     */
    private boolean frozen=false;

 

    /**
     * The Party that has this Role
     */
    //@DBRef(lazy=false)
    private Party party;

    /**
     * The Type of the PartyRole
     */
    private PartyRoleType partyRoleType;

    /**
     * The name of the PartyRole. In instance "customer", "vendor", etc.
     */
    private String name;

    /**
     * The starting date of validity of this Role for the Party
     */
    private Date fromDate;

    /**
     * The ending date of validity of this Role for the Party
     */
    private Date thruDate;

    public PartyRole(){}

    public PartyRole(Party party, PartyRoleType partyRoleType) {
        this.party = party;
        this.partyRoleType = partyRoleType;
    }

	


    
    
}