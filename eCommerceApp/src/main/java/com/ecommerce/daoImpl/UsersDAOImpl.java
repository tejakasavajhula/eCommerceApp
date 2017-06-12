package com.ecommerce.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.dao.UsersDAO;
import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Ship_Address;
import com.ecommerce.model.Users;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAllUsers() {
		String hql = "From Users";
		return entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Users getUserByName(String username) {
		return (Users) entityManager.createQuery("from Users where username=:username")
				.setParameter("username", username).getSingleResult();
	}

	@Override
	public void register(Users user) {
		entityManager.persist(user);
	}

	@Override
	public void deleteUser(String username) {

		String hql = "From Users where username=:username";

		Users user = (Users) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
		entityManager.remove(user);
	}

	@Override
	public void updateUser(String username, Users user) {
		String hql = "Update Users set pwd=:pwd, firstName=:fn,lastName=:ln, phone=:phone,email=:email,role=:role where username=:username";
		entityManager.createQuery(hql).setParameter("pwd", user.getPwd()).setParameter("fn", user.getFirstName())
				.setParameter("ln", user.getLastName()).setParameter("phone", user.getPhone())
				.setParameter("email", user.getEmail()).setParameter("role", user.getRole())
				.setParameter("username", username).executeUpdate();
	}

	public void updateUserAddress(String username, Users user) {

		Ship_Address addr = user.getAddress();
		// if(user.getUsername()==username){
		String hql = "Update Users set street=:street, city=:city,state=:state,country=:country where username=:username";
		entityManager.createQuery(hql).setParameter("street", addr.getStreet()).setParameter("city", addr.getCity())
				.setParameter("state", addr.getState()).setParameter("country", addr.getCountry())
				.setParameter("username", username).executeUpdate();
		// }

	}

	@Override
	public void removeCartForUser(String username) {
		String hql = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
		List<Line_Items> list = user.getLine_items();
		List<Line_Items> list2 = list;
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		user.setLine_items(list);
		entityManager.merge(user);
		for (int i = 0; i < list2.size(); i++)
			entityManager.remove(list2.get(i));
	}

	@Override
	public void addLineToCart(String username, Line_Items line) {

		String hql1 = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql1).setParameter("username", username).getSingleResult();
		
		int id=0;
		Line_Items line1=null;
		List<Line_Items> list = user.getLine_items();
		for (Line_Items line_Items : list) {
			if(line_Items.getProduct().getId() == line.getProduct().getId()){
				id=line_Items.getLine_id();
				line1=line_Items;
			}
		}
		if (id==0) {
			int p = line.getQuantity() * line.getProduct().getPrice();
			line.setPrice_per_line(p);
			list.add(line);
			user.setLine_items(list);
			entityManager.merge(user);
		}
		
		else {
			entityManager.createQuery("Update Line_Items set quantity=:q + :q1, price_per_line = :p1+:p2 where line_id=:id")
						 .setParameter("q", line1.getQuantity())
						 .setParameter("q1", line.getQuantity())
						 .setParameter("p1", line1.getPrice_per_line())
						 .setParameter("p2", line.getQuantity() * line.getProduct().getPrice())
						 .setParameter("id", id)
						 .executeUpdate();
		}
	}

	@Override
	public void removeLinefromCart(String username, int line_id) {
		String hql = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
		List<Line_Items> list = user.getLine_items();

		Line_Items line = (Line_Items) entityManager.createQuery("From Line_Items where line_id=:line_id")
				.setParameter("line_id", line_id).getSingleResult();
		list.remove(line);
		user.setLine_items(list);
		entityManager.merge(user);
	}

	@Override
	public List<Line_Items> getUserCart(String username) {
		String hql = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
		List<Line_Items> l = user.getLine_items();
		return l;
	}

	@Override
	public List<Orders> getOrdersForUser(String username) {

		String hql = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql).setParameter("username", username).getSingleResult();
		return user.getOrders();
	}

	@Override
	public void addOrder(String username, Orders ord) {
		String hql1 = "From Users where username=:username";
		Users user = (Users) entityManager.createQuery(hql1).setParameter("username", username).getSingleResult();
		List<Orders> list = user.getOrders();
		list.add(ord);
		user.setOrders(list);
		entityManager.merge(user);
	}

}
