package com.etiya.hms.repository.party;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.etiya.hms.model.party.Party;

/**
 * Created by mp on 05/01/15.
 */
public interface PartyRepository extends MongoRepository<Party, ObjectId> {
	
	@Query("{'person.givenName': {$regex: ?0 }}")
	public List<Party> findByFirstName(String firstName);
}