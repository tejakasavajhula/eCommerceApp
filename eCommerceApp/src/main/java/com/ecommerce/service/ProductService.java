package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Product;

public interface ProductService {

	public List<Product> listAllProducts();
	
	public Product getProductById(int pid);
	
	public void addProduct(Product p);
	
	public void updateProduct(int pid, Product p);
	
	public void deleteProduct(int pid);

}
