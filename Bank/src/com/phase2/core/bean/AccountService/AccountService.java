package com.phase2.core.bean.AccountService;
import java.util.Scanner;
import com.phase2.core.bean.AccountBalance.*;
import com.phase2.core.bean.HashMap.*;

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

		 if(U.equals(ReadToHashMap.readMap().get("AccountNum").getUserCredentials().getUsername())  && P.equals(ReadToHashMap.readMap().get("AccountNum").getUserCredentials().getPassword()))  {
			
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
				System.out.println("enter first name=");
				String fName =AccountService.readStrInput();
				System.out.println("enter last name");
				String lName=AccountService.readStrInput();
				
				String password=fName+"_"+lName ;
				System.out.println("your password is="+password);
				
				String userName = fName+"123";
				System.out.println("UserName is="+userName);
				
			   
				
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
		        		System.out.println("your account is empty");}
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

			
	            

	



