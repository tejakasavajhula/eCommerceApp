package com.ecommerce.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	public List<Product> listAllProducts() {
		String hql="From Product";
		return (List<Product>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Product getProductById(int pid) {
		String hql="From Product where id=:pid";
		return (Product) entityManager.createQuery(hql)
							 		  .setParameter("pid", pid)
							 		  .getSingleResult();
	}

	@Override
	public void addProduct(Product p) {
		entityManager.persist(p);
	}

	@Override
	public void updateProduct(int pid, Product p) {
		String hql="Update Product set name=:name,supplier=:supplier,price=:price where id=:pid";
		entityManager.createQuery(hql)
							 		  .setParameter("name", p.getName())
							 		  .setParameter("supplier", p.getSupplier())
							 		  .setParameter("price", p.getPrice())
							 		  .setParameter("pid", pid)
							 		  .executeUpdate();
	}

	@Override
	public void deleteProduct(int pid) {
		
		String hql = "From Product where id=:id";
		
		Product p = (Product) entityManager.createQuery(hql).setParameter("id", pid).getSingleResult();
		entityManager.remove(p);
	}

}
