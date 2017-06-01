package com.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ecommerce_Product")
public class Product implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_SEQ")
	@SequenceGenerator(name="PRODUCT_SEQ", sequenceName = "SEQUENCE_PRODUCT")
	int id;

	@Column(name = "name")
//	@NotEmpty(message="Product name cannot be empty")
	String name;

	
	@Column(name = "supplier")
	String supplier;

	@Column(name = "price")
//	@NotEmpty(message="Price cannot be empty")
	int price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
