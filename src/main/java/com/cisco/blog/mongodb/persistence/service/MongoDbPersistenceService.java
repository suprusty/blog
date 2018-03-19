package com.cisco.blog.mongodb.persistence.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoDbPersistenceService {
	@Autowired
	MongoOperations mongoTemplate;

	public MongoOperations getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoOperations mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
}
