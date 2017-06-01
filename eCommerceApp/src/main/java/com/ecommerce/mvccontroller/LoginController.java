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
}
