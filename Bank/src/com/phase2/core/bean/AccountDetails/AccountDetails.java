package com.phase2.core.bean.AccountDetails;
import com.phase2.core.bean.UserCredentials.*;
import com.phase2.core.bean.AccountBalance.*;
import com.phase2.core.bean.UserInfo.*;

	public class AccountDetails {
		private UserInfo userInfo;
		private UserCredentials userCredentials;
		private AccountBalance accountBalance;
		
		
		public AccountDetails() {
			
		}
		public AccountDetails(UserInfo userInfo, UserCredentials userCredentials, AccountBalance accountBalance) {
			super();
			this.userInfo = userInfo;
			this.userCredentials = userCredentials;
			this.accountBalance = accountBalance;
		}
		public UserInfo getUserInfo() {
			return userInfo;
		}
		public void setUserInfo(UserInfo userInfo) {
			this.userInfo = userInfo;
		}
		public UserCredentials getUserCredentials() {
			return userCredentials;
		}
		public void setUserCredentials(UserCredentials userCredentials) {
			this.userCredentials = userCredentials;
		}
		public AccountBalance getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(AccountBalance accountBalance) {
			this.accountBalance = accountBalance;
		}
		
		@Override
		public String toString() {
			return "AccountDetails [userInfo=" + userInfo + ", userCredentials=" + userCredentials + ", accountBalance="
					+ accountBalance + "]";
		}
	}






