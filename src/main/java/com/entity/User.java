package com.entity;
public class User {
	private int id;
	private String fullName;
	private String username;
	private String password;
	
	
	public User() {
		super();
		
	}
	public User(String fullName, String username, String password) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username =username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}