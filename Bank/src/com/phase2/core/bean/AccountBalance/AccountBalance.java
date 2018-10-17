package com.phase2.core.bean.AccountBalance;

public class AccountBalance {
	

		private int balance;

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public  int getBalance() {
			return balance;
		}
		
		public AccountBalance() {}
		public AccountBalance(int balance) {
			super();
			this.balance=balance;
		}

		@Override
		public String toString() {
			return "AccountBalance [balance=" + balance + "]";
		}
	}


