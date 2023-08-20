package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired	
private ProductRepository productRepository;
	@Override
	public Product addProduct(Product p) {
	
		return productRepository.save(p);
	}

	@Override
	public List<Product> addProduct(List<Product> p) {
		// TODO Auto-generated method stub
		return productRepository.saveAll(p);
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		return "Product id="+id+" removed";
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
	}

}
