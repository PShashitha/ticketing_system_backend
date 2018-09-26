package com.csse.cssebackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse.cssebackend.model.*;

public interface PassengerRepository extends MongoRepository<Passenger,Integer> {

}
