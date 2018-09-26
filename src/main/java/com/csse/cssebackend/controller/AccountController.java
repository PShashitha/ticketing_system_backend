package com.csse.cssebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csse.cssebackend.model.*;
import com.csse.cssebackend.service.*;

@RestController
@CrossOrigin
@RequestMapping("/Account")
public class AccountController {
	
	@Autowired
	private AccountService accservice;
	
	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public List<Account> getCompany(){
			return  accservice.getAccount();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Account addCompany(@RequestBody Account c) {
		//System.out.println(c.getCmpId());
		System.out.println(c.getAcccNO());
		return accservice.addAccount(c);
		
	}
	
	
}
