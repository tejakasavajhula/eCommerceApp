package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Orders;

public interface OrdersDAO {
	
	public List<Orders> listAllOrders();
	
	public Orders getOrderById(int id);
			
	public void updateOrder(int order_id, Orders ord);

}
