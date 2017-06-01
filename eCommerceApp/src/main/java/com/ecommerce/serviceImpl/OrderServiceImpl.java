package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.dao.OrdersDAO;
import com.ecommerce.model.Orders;
import com.ecommerce.service.OrderService;

@Repository
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrdersDAO orderdao;
	
	@Override
	public List<Orders> listAllOrders() {
		// TODO Auto-generated method stub
		return orderdao.listAllOrders();
	}

	@Override
	public Orders getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderdao.getOrderById(id);
	}

	@Override
	public void updateOrder(int order_id, Orders ord) {
		// TODO Auto-generated method stub
		orderdao.updateOrder(order_id, ord);
	}

}
