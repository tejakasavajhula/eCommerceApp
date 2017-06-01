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

import com.ecommerce.model.Orders;
import com.ecommerce.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderservice;
	
	@RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
	public ResponseEntity<List<Orders>> listAllOrders() {
		List<Orders> l = orderservice.listAllOrders();
		return new ResponseEntity<List<Orders>>(l, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getOrder/{id}", method = RequestMethod.GET)
	public ResponseEntity<Orders> getOrder(@PathVariable int id) {
		
		Orders l = (Orders) orderservice.getOrderById(id);
		return new ResponseEntity<Orders>(l, HttpStatus.OK);
	}
		
	@RequestMapping(value="/updateOrder/{id}",method = RequestMethod.PUT)
	public ResponseEntity<String> updateOrder(@PathVariable int id, @RequestBody Orders o){
		orderservice.updateOrder(id, o);
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}
}
