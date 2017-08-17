package com.yztc.demo.web.action;

import java.util.ArrayList;
import java.util.List;

import com.yztc.demo.entity.User;

public class UserAction {
	
	private List<User> listUser;
	
	public String findAll(){
		listUser = new ArrayList<User>();
		for(int i=1;i<=10;i++){
			User user = new User();
			user.setId(i);
			listUser.add(user);
		}
		return "findAll";
	}

	public List<User> getListUser() {
		return listUser;
	}

}
