package com.csse.cssebackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.csse.cssebackend.model.*;
import com.csse.cssebackend.service.*;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/journey")
public class JourneyController {
	
	@Autowired
	private JourneyService jService;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public List <Journey> getall(){
		return jService.getall();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Journey addStudent(@RequestBody Journey s) {
		System.out.println(s.getPhoneNumber());
		return jService.addJourney(s);
		
		
	}

}
