package com.etiya.hms.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.etiya.hms.model.party.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}