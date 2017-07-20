package com.zhy.sample_okhttp;

public class User {

	public String name ;
	public String password  ;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password) {
		this.name = username;
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "User{" +
				"username='" + name + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
