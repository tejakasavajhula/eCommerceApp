package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Users;

public interface UserService {

	public List<Users> getAllUsers();

	public void register(Users user);
	
	public Users getUserByName(String username);
	
	public void updateUser(String username,Users user);
	
	public void deleteUser(String username) ;

	public void removeCartForUser(String username) ;

	public void removeLinefromCart(String username, int line_id);

	public void addLineToCart(String username, Line_Items line);

	public List<Line_Items> getUserCart(String username);
	
	public void updateUserAddress(String username, Users user);

	public List<Orders> getOrdersForUser(String username);

	public void addOrder(String username, Orders ord);

}
