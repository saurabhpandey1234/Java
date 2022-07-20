package com.spring.poject.entities;

public class UserRegistration {
	
	private int userid;
	private String username;
	private String useremail;
	private String userpassword;
	private String userconfirpassword;
	public UserRegistration(int userid, String username, String useremail, String userpassword,
			String userconfirpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userconfirpassword = userconfirpassword;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUserconfirpassword() {
		return userconfirpassword;
	}
	public void setUserconfirpassword(String userconfirpassword) {
		this.userconfirpassword = userconfirpassword;
	}
	@Override
	public String toString() {
		return "UserRegistration [userid= " + userid + ", username= " + username + ", useremail= " + useremail
				+ ", userpassword= " + userpassword + ", userconfirpassword= " + userconfirpassword + "]";
	}
	
	
}
