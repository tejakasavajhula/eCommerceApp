package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.Users;

public interface UserRepository extends CrudRepository<Users, String>{

}
