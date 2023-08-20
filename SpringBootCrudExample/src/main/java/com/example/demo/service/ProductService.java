package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
 public Product addProduct(Product p);
 public List<Product> addProduct(List<Product> p);
 public List<Product> getProduct();
 public Product getProduct(int id);
 public String deleteProduct(int id);
 public Product updateProduct(Product p);
}
