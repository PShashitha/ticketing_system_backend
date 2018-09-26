package com.csse.cssebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.csse.cssebackend.model.*;
import com.csse.cssebackend.service.*;

@RestController
@CrossOrigin
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	private PassengerService passservice;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Passenger> getPassengers(){
			return  passservice.getPassengers();
	}
	
	@RequestMapping(value="/addPassenger", method=RequestMethod.POST)
	public Passenger addPassenger(@RequestBody Passenger u) {
		return passservice.addPassenger(u);
	}
	
	
	
}
