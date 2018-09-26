package com.csse.cssebackend.repository;

import org.springframework.stereotype.Repository;

import com.csse.cssebackend.model.*;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String>{
	
}
