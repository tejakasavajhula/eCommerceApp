package com.ecommerce.mvccontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private String message = "Welcome to eCommerce Application Portal";
	
	@RequestMapping("/")
	public String login(Map<String, Object> model) {

		model.put("message",message);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login1(Map<String, Object> model) {

		model.put("message",message);
		return "login";
	}
	
	@RequestMapping("/register")
	public String Register(Map<String, Object> model) {

		model.put("message",message);
		return "register";
	}
	
	@RequestMapping("/home")
	public String home(Map<String, Object> model) {

		model.put("message",message);
		return "home";
	}
	
	
}
