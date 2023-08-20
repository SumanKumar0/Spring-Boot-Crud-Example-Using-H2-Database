package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private double quantity;
private double price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
