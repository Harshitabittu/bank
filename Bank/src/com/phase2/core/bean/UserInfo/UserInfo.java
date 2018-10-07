package com.phase2.core.bean.UserInfo;


	public class UserInfo {
		private String fName;
		private String lName;
		private String email;
		
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getfName() {
			return fName;
		}
		
		
		
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getlName() {
			return lName;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		
		
		@Override
		public String toString() {
			return "UserInfo [fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
		}

	}


