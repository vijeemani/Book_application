package com.rev.pubhub.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rev.pubhub.jsp.UserRepository;
import com.rev.pubhub.model.User;


@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserRepository userRepo;
	User user = new User();

	@GetMapping("/register")
	public String login() {
		return "register";
	}
	@PostMapping("/save")
	public String add_user(@RequestParam("name")String name,@RequestParam("email") String email,@RequestParam("password")String password){
	
	user.setName(name);
    user.setEmail(email);
	user.setPassword(password);
	userRepo.save(user);
	System.out.println("User added");
		return "login";
	}
	@GetMapping("/login")
	public String login_user(){
		return "login";
	}
	@PostMapping("/validate")
     public String authorize(@RequestParam("email")String email , @RequestParam("password") String password){
		
		userRepo.findByEmailAndPassword(email, password);
		System.out.println("User logedin as "+email);
		return "board";
		
	}
	
}
