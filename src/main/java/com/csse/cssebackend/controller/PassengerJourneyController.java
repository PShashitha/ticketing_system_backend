package com.csse.cssebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csse.cssebackend.model.*;
import com.csse.cssebackend.service.*;;

@RestController
@CrossOrigin
@RequestMapping("/travels")
public class PassengerJourneyController {
	
	@Autowired
	private PassengerJourneyService pService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<PassengerJourney> getFormI1(){
			return  pService.getTravels();
	}
	
	@RequestMapping(value="/travel", method=RequestMethod.POST)
	public PassengerJourney addFormI1(@RequestBody PassengerJourney c) {
		System.out.println(c.getPasJnyID());
		return pService.addTravel(c);
		
		
	}
	


	
	
	
	
	
	
	
	
	
	
}
