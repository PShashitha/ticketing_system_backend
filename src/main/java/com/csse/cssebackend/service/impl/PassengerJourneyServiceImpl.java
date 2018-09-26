package com.csse.cssebackend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import com.csse.cssebackend.model.*;
import com.csse.cssebackend.repository.*;
import com.csse.cssebackend.service.*;

@Service
public class PassengerJourneyServiceImpl implements PassengerJourneyService {

	@Autowired
	private PassengerJourneyRepository pRepository;
	
	@Override
	public List<PassengerJourney> getTravels() {
		return pRepository.findAll();
	}

	@Override
	public PassengerJourney addTravel(PassengerJourney c) {
		System.out.println("this is impl"+c.getPasJnyID());
		return pRepository.insert(c);
		
	}


}
