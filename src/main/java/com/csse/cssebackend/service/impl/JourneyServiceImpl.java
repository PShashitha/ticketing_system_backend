package com.csse.cssebackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csse.cssebackend.model.*;
import com.csse.cssebackend.repository.*;
import com.csse.cssebackend.service.*;

@Service
public class JourneyServiceImpl implements JourneyService {

	@Autowired
	private JourneyRepository journeyrepo;
	
	@Override
	public List<Journey> getall() {
		return journeyrepo.findAll();
	}

	@Override
	public Journey addJourney(Journey s) {
		System.out.println("this is impl"+s.getJnyID());
		Journey r = journeyrepo.insert(s);
		System.out.println(r.getPhoneNumber());
		return r;
	}

}
