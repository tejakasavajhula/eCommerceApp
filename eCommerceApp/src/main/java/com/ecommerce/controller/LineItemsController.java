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
import com.ecommerce.service.LineService;

@RestController
public class LineItemsController {

	@Autowired
	LineService lineservice;
	
	@RequestMapping(value = "/getAllLines", method = RequestMethod.GET)
	public ResponseEntity<List<Line_Items>> listAllLines() {
		List<Line_Items> l = lineservice.listAllLines();
		return new ResponseEntity<List<Line_Items>>(l, HttpStatus.OK);
	}
		
	@RequestMapping(value = "/updateLine/{line_id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateLine(@RequestBody Line_Items line, @PathVariable int line_id) {
		lineservice.updateLine(line, line_id);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deleteLine/{line_id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteLine(@PathVariable int line_id) {
		lineservice.removeLine(line_id);
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
}
