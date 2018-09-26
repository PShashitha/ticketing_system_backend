package com.csse.cssebackend.service;

import java.util.List;
import com.csse.cssebackend.model.*;

public interface AccountService {
	
	public List<Account> getAccount();
	public Account addAccount(Account c) ;
	
}
