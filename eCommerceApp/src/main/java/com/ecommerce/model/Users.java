package com.ecommerce.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ecommerce_Users")
public class Users implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="firstname")
	private String firstName;

	@Column(name="lastname")
	private String lastName;
		
	
	@Column(name="phone")
	private int phone;
		
	@Column(name="email")
	private String email;
	
	@Column(name="role")
	private String role;
	
 	@Embedded
 	private Ship_Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = {@JoinColumn(name="username")}, inverseJoinColumns={@JoinColumn(name= "line_id")})
	private List<Line_Items> line_items;
	
	@OneToMany(cascade = CascadeType.ALL)
 	@JoinTable(joinColumns = {@JoinColumn(name="username")}, inverseJoinColumns={@JoinColumn(name= "order_id")})
	private List<Orders> orders;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Ship_Address getAddress() {
		return address;
	}

	public void setAddress(Ship_Address address) {
		this.address = address;
	}

	public List<Line_Items> getLine_items() {
		return line_items;
	}

	public void setLine_items(List<Line_Items> line_items) {
		this.line_items = line_items;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
}
