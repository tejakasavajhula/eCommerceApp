package com.ecommerce.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.dao.OrdersDAO;
import com.ecommerce.model.Orders;

@Repository
@Transactional
public class OrdersDAOImpl implements OrdersDAO {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> listAllOrders() {
		return entityManager.createQuery("from Orders").getResultList();
	}

	@Override
	public Orders getOrderById(int id) {
		return (Orders) entityManager.createQuery("from Orders where order_id=:order_id").setParameter("order_id", id)
				.getSingleResult();
	}

	@Override
	public void updateOrder(int order_id, Orders ord) {

		String hql = "Update Orders set ship_date=:shipdate,status=:status where order_id=:order_id";
		entityManager.createQuery(hql).setParameter("shipdate", ord.getShip_date())
				.setParameter("status", ord.getStatus()).setParameter("order_id", order_id).executeUpdate();

	}

}
