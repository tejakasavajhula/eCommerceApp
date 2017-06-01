package com.ecommerce.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ecommerce_Orders")
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_SEQ")
	@SequenceGenerator(name = "ORDER_SEQ", sequenceName = "SEQUENCE_ORDERS")
	private int order_id;

	@Column(name = "order_value", nullable = false)
	private int order_value;

	@Column(name = "order_date", nullable = false)
	private Date order_date;

	@Column(name = "ship_date")
	private Date ship_date;

	@Column(name = "status", nullable = false)
	private String status;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_value() {
		return order_value;
	}

	public void setOrder_value(int order_value) {
		this.order_value = order_value;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getShip_date() {
		return ship_date;
	}

	public void setShip_date(Date ship_date) {
		this.ship_date = ship_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
