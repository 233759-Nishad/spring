package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.product;

import come.example.repository.productrepo;

@Service

public class productservice {
	
	@Autowired
	private productrepo repo;

	public static List<product> saveproducts(List<product> product) {
		// TODO Auto-generated method stub
		return repo.saveAll(product);
	}

	public static List<product> getProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
