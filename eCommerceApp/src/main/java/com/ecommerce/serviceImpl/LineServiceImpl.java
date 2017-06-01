package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.dao.LineItemsDAO;
import com.ecommerce.model.Line_Items;
import com.ecommerce.service.LineService;

@Repository
public class LineServiceImpl implements LineService{

	@Autowired
	LineItemsDAO linedao;
	
	@Override
	public List<Line_Items> listAllLines() {
		// TODO Auto-generated method stub
		return linedao.listAllLines();
	}

	@Override
	public void removeLine(int line_id) {
		// TODO Auto-generated method stub
		linedao.removeLine(line_id);
	}

	@Override
	public void updateLine(Line_Items line, int line_id) {
		// TODO Auto-generated method stub
		linedao.updateLine(line, line_id);
	}

}