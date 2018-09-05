package com.etiya.hms.model.party;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 04/01/15
 * Time: 21:23
 */
@Document(collection = "par_partyroletype")
@TypeAlias("party.PartyRoleType")
@Data
@RequiredArgsConstructor
public class PartyRoleType {
    @Id
    private ObjectId id;
    /**
     * The code of the PartyRoleType
     */
//    @Indexed(unique=true)
    @NonNull private String code;

    /**
     * The status (canceled/not canceled) of the PartyRoleType;
     */
    private boolean canceled;

    /**
     * The status (freezed/not freezed) of the PartyRoleType;
     */
    private boolean frozen;
 

    /**
     * The multi-language name of the PartyRoleType
     */
    @NonNull private String name;

    /**
     * The multi-language description of the PartyRoleType
     */
    private String description;
}