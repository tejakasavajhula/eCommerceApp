package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.Orders;


public interface OrderRepository extends CrudRepository<Orders, Integer>{

}
