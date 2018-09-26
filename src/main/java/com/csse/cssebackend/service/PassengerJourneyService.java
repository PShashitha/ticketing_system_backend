package com.csse.cssebackend.service;

import java.util.List;
import com.csse.cssebackend.model.*;

public interface PassengerJourneyService {
	
	public List<PassengerJourney> getTravels();
	// public Form_i_1 getFormi1ByStudentID(String studentID);
	public PassengerJourney addTravel(PassengerJourney c) ;
	
	// public Form_i_1 updateFormi1ByFormid(String formid,Form_i_1 c);

	
}