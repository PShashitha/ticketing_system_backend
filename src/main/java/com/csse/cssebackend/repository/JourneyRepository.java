package com.csse.cssebackend.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.csse.cssebackend.model.*;

@Repository
public interface JourneyRepository  extends MongoRepository<Journey, String> {

}
