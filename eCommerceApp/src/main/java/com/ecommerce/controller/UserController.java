package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Users;
import com.ecommerce.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@RequestMapping(value="/getAllUsers",method=RequestMethod.GET)
	public ResponseEntity<List<Users>> getAllUsers() {

		List<Users> l = userservice.getAllUsers();
		return new ResponseEntity<List<Users>>(l,HttpStatus.OK);
	}

	@RequestMapping(value="/getUser/{username}",method=RequestMethod.GET)
	public ResponseEntity<Users> getUserbyName(@PathVariable String username) {

		Users user = userservice.getUserByName(username);
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getCart/{username}", method = RequestMethod.GET)
	public ResponseEntity<List<Line_Items>> getCart(@PathVariable String username) {
		List<Line_Items> l = userservice.getUserCart(username);
		return new ResponseEntity<List<Line_Items>>(l, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getOrders/{username}", method = RequestMethod.GET)
	public ResponseEntity<List<Orders>> listOrdersForUser(@PathVariable String username) {
		
		List<Orders> l = userservice.getOrdersForUser(username);
		return new ResponseEntity<List<Orders>>(l, HttpStatus.OK);
	}

	@RequestMapping(value="/addOrder/{username}",method = RequestMethod.PUT)
	public ResponseEntity<String> addOrder(@PathVariable String username, @RequestBody Orders o){
		userservice.addOrder(username, o);
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}

	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ResponseEntity<String> registerUsers(@RequestBody Users user) {
		try {
			userservice.register(user);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error inserting in Users DB");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

	@RequestMapping(value="/addCartLine/{username}",method=RequestMethod.POST)
	public ResponseEntity<String> addCartLine(@PathVariable String username, @RequestBody Line_Items line) {
		try {
			userservice.addLineToCart(username, line);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error adding line");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

	@RequestMapping(value="/deleteUser/{username}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUsers(@PathVariable String username) {
		try {
			userservice.deleteUser(username);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error deleting");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}
	
	@RequestMapping(value="/deleteCart/{username}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteCart(@PathVariable String username) {
		try {
			userservice.removeCartForUser(username);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error deleting");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

	@RequestMapping(value="/deleteCartLine/{username}/{line_id}",method=RequestMethod.DELETE)
	public ResponseEntity<String> removeCartLine(@PathVariable String username, @PathVariable int line_id) {
		try {
			userservice.removeLinefromCart(username, line_id);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error deleting");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}


	@RequestMapping(value="/updateUser/{username}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@PathVariable String username, @RequestBody Users user){

		try {
			userservice.updateUser(username,user);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error updating");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

	@RequestMapping(value="/updateUserAddress/{username}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateUserAddress(@PathVariable String username, @RequestBody Users user){

		try {
			userservice.updateUserAddress(username, user);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error updating");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

}
