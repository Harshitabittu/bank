package com.phase2.core.bean.Bank;
import com.phase2.core.bean.AccountService.*;

public class Bank {

	public static void main(String[] args) {
	System.out.println("Welcome to the Bank");
	System.out.println("choose an appropriate option");
	System.out.println("Press 1 if you are an existing User");
	System.out.println("press 2 if u want to open an account");
	
	
	   int choice =AccountService.readInput();
	switch(choice){
	   case 1: AccountService.handleExistingUser();
	           break;
	   case 2: AccountService.createNewAccount();
	           break;
	   default:System.out.println("invalid input");
	           break;
				}
			}

		}

	

	


