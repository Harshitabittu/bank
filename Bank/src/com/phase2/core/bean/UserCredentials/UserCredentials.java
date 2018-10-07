package com.phase2.core.bean.UserCredentials;

public class UserCredentials {

		
		
		private String userName;
	    private String password;
	    
	    public void setUsername(String userName) {
			this.userName = userName;
		}
		public String getUsername() {
			return userName;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPassword() {
			return password;
		}
		
		@Override
		public String toString() {
			return "UserCredentials [username=" + userName + ", password=" + password + "]";
		}
	}



