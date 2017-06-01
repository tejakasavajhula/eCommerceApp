package com.ecommerce.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ecommerce_Cart")
public class Line_Items implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="line_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LINE_SEQ")
	@SequenceGenerator(name = "LINE_SEQ", sequenceName = "SEQUENCE_LINES")
	private int line_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
		
	@Column(name = "quantity",nullable=false)
//	@NotEmpty(message="Quantity cannot be empty")
	private int quantity;

	@Column(name="price_per_line")
	private int price_per_line;

	public Line_Items() {
	}
	
	public Line_Items(Product product, Users user, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.price_per_line = product.getPrice()*quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice_per_line() {
		return price_per_line;
	}

	public void setPrice_per_line(int price_per_line) {
		this.price_per_line = price_per_line;
	}

}
