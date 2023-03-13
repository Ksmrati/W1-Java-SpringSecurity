package com.springbootsecurity.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootsecurity.models.User;



@Service
public class UserServices {

List<User> list = new ArrayList<>();
	
	public UserServices() {
		String username;
		String password;
		String email;
		list.add(new User(username= "abc", password="abc", email="abc@gmail.com"));
		list.add(new User(username="xyz", password="xyz", email="xyz@gmail.com"));
	}
	
	public List<User> getAllUsers(){
		return this.list;
	}
	
	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
