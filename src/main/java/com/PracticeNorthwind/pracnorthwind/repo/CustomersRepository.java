package com.PracticeNorthwind.pracnorthwind.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PracticeNorthwind.pracnorthwind.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, String> {

	List<Customers> findByCustomerCity(String CustomerCity); // Need to put "List" so that you get 
	// all of the customers in that city

}
