package com.phase2.core.bean.HashMap;
import com.phase2.core.bean.AccountBalance.*;

import java.util.Set;
import com.phase2.core.bean.AccountDetails.*;
import com.phase2.core.bean.UserCredentials.*;
import com.phase2.core.bean.UserInfo.*;
import java.util.HashMap;
import com.phase2.core.bean.AccountService.*;


public class ReadToHashMap {

	
	static HashMap<String,AccountDetails>AccountDetailsMap=new HashMap<String,AccountDetails>();
		  public static HashMap<String,AccountDetails> readMap() {
			

	        
	        
	        
	        UserInfo userInfo=new UserInfo();
	        userInfo.setfName("harshita");
	        userInfo.setlName("Singh");
	        userInfo.setEmail("bhati.harshita987@gmail.com");


	        UserCredentials userCredentials=new UserCredentials();
	        userCredentials.setUsername("bhati.harshita987@gmail.com");
	        userCredentials.setPassword("harshita_Singh");

	        AccountBalance accountBalance=new AccountBalance();
	        accountBalance.setBalance(100000);

	        AccountDetails accountDetails=new AccountDetails();
	        accountDetails.setUserInfo(userInfo);
	        accountDetails.setUserCredentials(userCredentials);
	        accountDetails.setAccountBalance(accountBalance);

	        String AccountNum=String.valueOf(Math.random()*1000);
	        AccountDetails accountDetails1=new AccountDetails(userInfo,userCredentials,accountBalance);
			   

		
	         AccountDetailsMap.put(AccountNum,accountDetails);
	         AccountDetailsMap.put(AccountNum,accountDetails1);
	         
	         return AccountDetailsMap;

	    }

	}







			// TODO Auto-generated method stub

		





