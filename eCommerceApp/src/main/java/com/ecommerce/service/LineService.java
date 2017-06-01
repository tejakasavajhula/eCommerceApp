package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Line_Items;

public interface LineService {

	public List<Line_Items> listAllLines();
		
	public void removeLine(int line_id);
	
	public void updateLine(Line_Items line,int line_id);

}
