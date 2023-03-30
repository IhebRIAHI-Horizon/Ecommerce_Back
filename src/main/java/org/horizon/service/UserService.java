package org.horizon.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.horizon.entity.User;
import org.horizon.repository.RoleRepository;
import org.horizon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	public User getUser(int userId) {
		return userRepo.findById(userId).get();
	}
	
	public List<User> getUsers() {
		return StreamSupport.stream(userRepo.findAll().spliterator(), false)
		        .collect(Collectors.toList());
	}
	
	public void addUser(User user) {
		
		user.setUserPassword(bCryptPasswordEncoder.encode(user.getUserPassword()));
		userRepo.save(user);
	}
	
}
