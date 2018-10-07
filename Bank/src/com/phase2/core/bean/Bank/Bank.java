package com.phase2.core.bean.Bank;
import com.phase2.core.bean.AccountService.*;

public class Bank {

	public static void main(String[] args) {
	System.out.println("Welcome to the Bank");
	System.out.println("choose appropriate option");
	System.out.println("1. existing User");
	System.out.println("2. open an account");
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

	

	


