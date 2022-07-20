package com.spring.poject.entities;

public class UserLogin {
	
	private int userid;
	private String username;
	private String userpassword;
	public UserLogin(int userid, String username, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
	}
	public UserLogin() {
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
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "UserLogin [userid= " + userid + ", username= " + username + ", userpassword= " + userpassword + "]";
	}
	
	
}
