package com.etiya.hms.repository.party;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.etiya.hms.model.party.Party;

/**
 * Created by mp on 05/01/15.
 */
public interface PartyRoleTypeRepository extends MongoRepository<Party, ObjectId> {
}