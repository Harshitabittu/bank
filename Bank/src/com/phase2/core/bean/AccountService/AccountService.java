package com.phase2.core.bean.AccountService;


import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.phase2.core.bean.AccountBalance.*;
import com.phase2.core.bean.AccountBalanceIsEmptyException.AccountBalanceIsEmptyException;
import com.phase2.core.bean.AccountDetails.AccountDetails;
/*import com.phase2.core.bean.HashMap.ReadToHashMap;*/
import com.phase2.core.bean.UserInfo.UserInfo;
import com.phase2.core.bean.UserCredentials.*;
import com.phase2.core.bean.AccountDetails.*;

	public class AccountService {
		
		public static int readInput(){
	    Scanner scanInt=new Scanner(System.in);
		int value =scanInt.nextInt();
		return value;}

	    public static String readStrInput(){
	    Scanner scanStr=new Scanner(System.in);
		String output=scanStr.next();
		return output;}

			 

		public static void handleExistingUser(){
	char ch = ' ';
			 do {
				    System.out.print("enter USERNAME=");
			        String U=AccountService.readStrInput();
			        System.out.print("enter PASSWORD=");
			        String P=AccountService.readStrInput();
			       String un= createNewAccount().;
			       String pw= ReadToHashMap.rea.getUserCredentials().getPassword();
		 if(U.equals(un)  && P.equals(pw))  {
			
				          System.out.println("you are logged in");
				          System.out.println("choose action");
				          System.out.println("1.withdraw");
				          System.out.println("2.deposit");
				          System.out.println("3.close account");
				          int choice =AccountService.readInput();
				          

				         switch(choice){
		                         case 1:AccountService.withdraw();
		                                 break;
		                         case 2:AccountService.deposit();
		                                 break;  
		                         case 3:AccountService.close();
		                                 break;
		                         default:System.out.println("Invalid Input");}
			              }
			        else{
			
			              System.out.println("incorrect username password");
			              System.out.println("want to reenter type yes or no");
			              Scanner s=new Scanner(System.in);
			             
			              ch=s.next().charAt(0);
			              }

			              }while(ch=='y'||ch=='Y');
			          }
			public static void createNewAccount(){
				
				HashMap<String,AccountDetails>AccountDetailsMap=new HashMap<String,AccountDetails>();
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
		        
				   
                AccountDetailsMap.put(AccountNum,accountDetails);
                System.out.println(AccountDetailsMap);
                
				HashMap<String,AccountDetails> userMap=new HashMap<String,AccountDetails>();
                System.out.println("enter first name=");
				String fName =AccountService.readStrInput();
				System.out.println("enter last name");
				String lName=AccountService.readStrInput();
				
				String password=fName+"_"+lName ;
				System.out.println("your password is="+password);
				
				String userName = fName+"123";
				System.out.println("UserName is="+userName);
				
			   System.out.println("enter your balance");
			   int balance=AccountService.readInput();
			   System.out.println("your current balance is "+balance);
			   
			   System.out.println("enter your mail id");
			   String email=AccountService.readStrInput();
			   
			   String AccountNum1=String.valueOf(Math.random()*1000);
			   System.out.println("your account no is"+AccountNum1);
			   UserInfo userInfo1=new UserInfo(fName,lName,email);
			   UserCredentials userCredentials1=new UserCredentials(userName,password);
			   AccountBalance accountBalance1=new AccountBalance(balance);
			   AccountDetails accountDetails1=new AccountDetails(userInfo1,userCredentials1,accountBalance1);
			   userMap.put(AccountNum1,accountDetails1);
			  
			   
			   AccountDetailsMap.putAll(userMap);
			   
			   
			   Set s1=AccountDetailsMap.entrySet();
				Iterator itr=s1.iterator();
				while(itr.hasNext()) {
					Map.Entry m1=(Entry) itr.next();
					System.out.println(m1.getKey()+"   "+m1.getValue());
						
					
				}
				
			   
			   
			   
			   AccountService.handleExistingUser();
			  
			   
				
			   
				
			    }
				

			public static int withdraw(int amt){
				int Balance=ReadToHashMap.readMap().get("AccountNum").getAccountBalance().getBalance()-amt;
				return Balance;
				
			}
			
		
			
			public static int deposit(int amount){
				int balance=ReadToHashMap.readMap().get("AccountNum").getAccountBalance().getBalance()+amount;
				return balance;
			}
			
			
			public static void withdraw(){
				System.out.println("enter UserName");
				String tmp=AccountService.readStrInput();
		        if(tmp.equals( ReadToHashMap.readMap().get("AccountNum").getUserCredentials().getUsername())) {
		        	if(ReadToHashMap.readMap().get("AccountNum").getAccountBalance().getBalance()==0) {
		        		throw new AccountBalanceIsEmptyException("Sorry");}
		        	else{
		        		System.out.println("enter the amount");
		        		int amt1=AccountService.readInput();

		        	    if(amt1>ReadToHashMap.readMap().get("AccountNum").getAccountBalance().getBalance()){
		        			System.out.println("enter valid amount");
		        			int amt2 =AccountService.readInput();
		        			int cb=AccountService.withdraw(amt2);
		        			System.out.println("amount withdrawl successfully");
		        			System.out.println("your current balance is="+cb);
		        		
		        		}
		        		else{
		 
		        			int cb=AccountService.withdraw(amt1);
		        			System.out.println("amount withdrawl successfully");
		        			System.out.println("your current balance is="+cb);
		        		
		        	}}}
		       else 
		             {System.out.println("wrong Username");}

		        }
			
		        
			public static void deposit(){
				System.out.println("enter UserName=");
				String tmp=AccountService.readStrInput();
				 Map<String,AccountDetails> detailsMap = ReadToHashMap.readMap();
				
				 Set<String> mySet = detailsMap.keySet();
			Iterator<String> iterator =	mySet.iterator();
				while (iterator.hasNext()) {
					String key = iterator.next();
					System.out.println(key);
					
				}
					
					
				  if(tmp.equals( ReadToHashMap.readMap().get("AccountNum").getUserCredentials().getUsername())) {
			    	System.out.println("enter the amount");
			    	int amount=AccountService.readInput();
			    	int dp=deposit(amount);
			    	System.out.println("successfully deposited");
			    	System.out.println("your current balance is="+dp);}
			    	else{
			    		System.out.println("wrong UserName");;
			    	}

			}
			public static void close(){
				System.out.println("enter Username");
				String temp=AccountService.readStrInput();
				 if(temp.equals( ReadToHashMap.readMap().get("AccountNum").getUserCredentials().getUsername())) {
					System.out.println("your acc has been  closed");}
					else{
						System.out.println("wrong Username");
					}}
			}

			
	            

	



