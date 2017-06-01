package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Repository
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productdao;
	
	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return productdao.listAllProducts();
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return productdao.getProductById(pid);
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		productdao.addProduct(p);
	}

	@Override
	public void updateProduct(int pid, Product p) {
		// TODO Auto-generated method stub
		productdao.updateProduct(pid, p);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		productdao.deleteProduct(pid);
	}

}
