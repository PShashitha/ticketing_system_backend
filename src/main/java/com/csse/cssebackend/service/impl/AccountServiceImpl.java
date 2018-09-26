package com.csse.cssebackend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csse.cssebackend.model.*;
import com.csse.cssebackend.repository.*;
import com.csse.cssebackend.service.*;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository acountrepo;
	
	@Override
	public List<Account> getAccount() {
		return acountrepo.findAll();
	}

	@Override
	public Account addAccount(Account c) {
		System.out.println("this is impl"+c.getAcccNO());
		return acountrepo.insert(c);
		
	}
	
}
