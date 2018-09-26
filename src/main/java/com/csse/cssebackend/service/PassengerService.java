package com.csse.cssebackend.service;

import java.util.List;

import com.csse.cssebackend.model.*;

public interface PassengerService {
	
	public Passenger addPassenger(Passenger u);
	public List<Passenger> getPassengers();

}
