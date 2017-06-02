package com.ecommerce.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.dao.LineItemsDAO;
import com.ecommerce.model.Line_Items;
import com.ecommerce.model.Product;

@Repository
@Transactional
public class LineItemsDAOImpl implements LineItemsDAO{

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Line_Items> listAllLines() {
		return entityManager.createQuery("from Line_Items").getResultList();
	}
	
	@Override
	public void removeLine(int line_id) {
		try {
			String hql="From Line_Items where line_id=:line_id";
			Line_Items line = (Line_Items) entityManager.createQuery(hql)
														.setParameter("line_id", line_id)
														.getSingleResult();
			line.setProduct(new Product());
			entityManager.merge(line);
			entityManager.remove(line);
		}
		catch(Exception e){
			System.out.println("The line cannot be removed yet as it is still present in a user's cart");
		}
	}

	@Override
	public void updateLine(Line_Items line,int line_id) {
		int q = line.getQuantity();
		int p = q*line.getProduct().getPrice();
		String hql = "Update Line_Items set quantity=:quantity, price_per_line=:p where line_id=:line_id";
		entityManager.createQuery(hql)
					 .setParameter("quantity",q)
					 .setParameter("p", p)
					 .setParameter("line_id", line_id)
					 .executeUpdate();

	}

}
