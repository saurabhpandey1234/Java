package com.spring.poject.entities;

public class Admin {
	
		private int adminid;
		private String adminname;
		private String adminpassword;
		public Admin(int adminid, String adminname, String adminpassword) {
			super();
			this.adminid = adminid;
			this.adminname = adminname;
			this.adminpassword = adminpassword;
		}
		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getAdminid() {
			return adminid;
		}
		public void setAdminid(int adminid) {
			this.adminid = adminid;
		}
		public String getAdminname() {
			return adminname;
		}
		public void setAdminname(String adminname) {
			this.adminname = adminname;
		}
		public String getAdminpassword() {
			return adminpassword;
		}
		public void setAdminpassword(String adminpassword) {
			this.adminpassword = adminpassword;
		}
		@Override
		public String toString() {
			return "Admin [adminid= " + adminid + ", adminname= " + adminname + ", adminpassword= " + adminpassword + "]";
		}
		
}
