package com.rev.pubhub.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rev.pubhub.jsp.UserRepository;
import com.rev.pubhub.model.User;
import com.rev.pubhub.service.UserService;
import com.rev.pubhub.util.EmailUtil;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	User user = new User();
	EmailUtil eMail = new EmailUtil();

	@GetMapping("/register")
	public String login() {
		return "register";
	}

	@PostMapping("/save")
	public String add_user(@RequestParam("name")String name,@RequestParam("email") String email,@RequestParam("password")String pwd,HttpSession session) throws Exception
	{
 
		return  userService.save(name,email,pwd);
	
	}


	@GetMapping("/login")
	public String login_user() {
		return "login";
	}

	@PostMapping("/validate")
	public String authorize(@RequestParam("email") String email, @RequestParam("password") String password) {

		userService.findByEmailAndPassword(email, password);
		System.out.println("User logedin as " + email);
		return "board";

	}

	@GetMapping("/logout")
	public String signOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";

	}

}
