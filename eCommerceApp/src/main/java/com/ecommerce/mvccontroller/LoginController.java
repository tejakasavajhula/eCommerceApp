package com.ecommerce.mvccontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.model.Orders;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import com.ecommerce.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private ProductService p;
	
	@Autowired
	private UserService u;

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
	public String home(Model model) {

		List<Product> list1 = p.listAllProducts();
		model.addAttribute("list",list1);
		return "home";
	}
	
	@RequestMapping("/viewProduct/{productID}")
	public String viewProduct(Model model,@PathVariable("productID") int productID) {

		Product prod = p.getProductById(productID);
		model.addAttribute("prod",prod);
		return "product";
	}

	@RequestMapping("/viewOrders/{username}")
	public String viewOrders(Model model,@PathVariable String username) {

		List<Orders> list1 = u.getOrdersForUser(username);
		model.addAttribute("list1",list1);
		return "vieworders";
	}

}
