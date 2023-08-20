package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	@GetMapping("/product")
	List<Product> getProduct()
	{
		return productService.getProduct();
	}
	@GetMapping("/product/{id}")
	Product getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}
	@PostMapping("/product")
	Product addProduct(@RequestBody Product p)
	{
		return productService.addProduct(p);
	}
	@PostMapping("/products")
	List<Product> addProduct(@RequestBody List<Product> p)
	{
		return productService.addProduct(p);
	}
	@PutMapping("/product")
	Product updateProduct(@RequestBody Product p)
	{
		return productService.updateProduct(p);
	}
	@DeleteMapping("/product/{id}")
	String deleteProduct(@PathVariable int id)
	{
		return productService.deleteProduct(id);
	}


}
