package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Orders;

public interface OrderService {

	public List<Orders> listAllOrders();
	
	public Orders getOrderById(int id);
		
	public void updateOrder(int order_id, Orders ord);

}
