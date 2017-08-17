package com.yztc.demo.web.action;


public class LoginAction {
	
	private String userName;
	private String password;	
	
	
	public String execute(){	
		System.out.println(userName);
		System.out.println(password);
		return "success";	
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
