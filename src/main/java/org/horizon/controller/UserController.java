package org.horizon.controller;

import java.util.List;
 

import org.horizon.entity.User;
import org.horizon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable int userId){
		return userService.getUser(userId);
	}
	
	@GetMapping("")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@PostMapping("")
	public void addUser(@RequestBody User user){
		System.out.println(user);

		userService.addUser(user);
	}
	
	
}