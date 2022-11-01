package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.product;
import com.example.service.productservice;


@RestController


public class productcontroller {
	
	@Autowired
	productservice productservices;
	@PostMapping ("/addproduct")
	public List<product>addproduct(@RequestBody List<product> product){
		return productservice.saveproducts(product);
	}
	
	@GetMapping("/prodcuts")
	public List<product>findAllProducts(){
		return productservice.getProduct();
		
	}
	

}
