package com.csse.cssebackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.csse.cssebackend.model.*;
import com.csse.cssebackend.repository.*;
import com.csse.cssebackend.service.*;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passrepo;
	
	@Override
	public Passenger addPassenger(Passenger u) {
		return passrepo.insert(u);
	}

	@Override
	public List<Passenger> getPassengers() {
		return passrepo.findAll();
	}


}
