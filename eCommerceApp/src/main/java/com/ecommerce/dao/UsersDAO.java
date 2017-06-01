package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Users;

public interface UsersDAO {

	public List<Users> getAllUsers();
	
	public Users getUserByName(String username);

	public void register(Users user);
		
	public void updateUser(String username,Users user);
	
	public void updateUserAddress(String username, Users user);

	public void deleteUser(String username) ;

	public void removeCartForUser(String username) ;

	public List<Line_Items> getUserCart(String username);
	
	public void removeLinefromCart(String username, int line_id);

	public void addLineToCart(String username, Line_Items line);

	public List<Orders> getOrdersForUser(String username);

	public void addOrder(String username, Orders ord);

}
