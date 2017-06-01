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

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService p;

	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> listProducts() {
		List<Product> l = p.listAllProducts();
		return new ResponseEntity<List<Product>>(l, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> listProducts(@PathVariable int id) {

		Product p2 = p.getProductById(id);
		return new ResponseEntity<Product>(p2, HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteProduct/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<String> removeProd(@PathVariable int id){

		try {
			p.deleteProduct(id);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error deleting");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}

	@RequestMapping(value="/updateProduct/{id}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product pi){

		try {
			p.updateProduct(id,pi);
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error updating");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody Product pi) {
		try {
			p.addProduct(pi);
			System.out.println("registered successfully");
			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("error registering");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}
}
