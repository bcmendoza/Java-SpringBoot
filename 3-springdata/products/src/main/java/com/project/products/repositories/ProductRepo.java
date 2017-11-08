package com.project.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.products.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{
	List<Product> findAll();
}
