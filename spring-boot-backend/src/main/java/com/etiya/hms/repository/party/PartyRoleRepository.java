package com.etiya.hms.repository.party;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.etiya.hms.model.party.Party;
import com.etiya.hms.model.party.PartyRole;

/**
 * Created by mp on 05/01/15.
 */
public interface PartyRoleRepository extends MongoRepository<Party, ObjectId> {

	Party save(@Valid PartyRole partyRole);
}