package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.dao.UsersDAO;
import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Users;
import com.ecommerce.service.UserService;

@Repository
public class UserServiceImpl implements UserService{

	@Autowired
	UsersDAO userdao;
	
	@Override
	public void register(Users user) {
		// TODO Auto-generated method stub
		userdao.register(user);
	}

	@Override
	public Users getUserByName(String username) {
		// TODO Auto-generated method stub
		return userdao.getUserByName(username);
	}

	@Override
	public void updateUser(String username, Users user) {
		// TODO Auto-generated method stub
		userdao.updateUser(username, user);
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		userdao.deleteUser(username);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userdao.getAllUsers();
	}

	@Override
	public void updateUserAddress(String username, Users user) {
		// TODO Auto-generated method stub
		userdao.updateUserAddress(username, user);
	}

	@Override
	public List<Orders> getOrdersForUser(String username) {
		// TODO Auto-generated method stub
		return userdao.getOrdersForUser(username);
	}

	@Override
	public void addOrder(String username, Orders ord) {
		// TODO Auto-generated method stub
		userdao.addOrder(username, ord);
	}

	@Override
	public void removeLinefromCart(String username, int line_id) {
		// TODO Auto-generated method stub

		userdao.removeLinefromCart(username, line_id);
	}

	@Override
	public void removeCartForUser(String username) {
		// TODO Auto-generated method stub
		userdao.removeCartForUser(username);
	}

	@Override
	public List<Line_Items> getUserCart(String username) {
		// TODO Auto-generated method stub
		return userdao.getUserCart(username);
	}

	@Override
	public void addLineToCart(String username, Line_Items line) {
		// TODO Auto-generated method stub
		userdao.addLineToCart(username, line);
	}

}
