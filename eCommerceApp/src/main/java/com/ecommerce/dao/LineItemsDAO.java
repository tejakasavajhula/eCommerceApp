package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Line_Items;

public interface LineItemsDAO {

	public List<Line_Items> listAllLines();
			
	public void removeLine(int line_id);
	
	public void updateLine(Line_Items line,int line_id);
}
