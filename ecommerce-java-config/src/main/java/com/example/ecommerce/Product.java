package com.example.ecommerce;
import java.util.ArrayList;
import java.util.List;
public class Product {
    private List<String> products = new ArrayList<>();
    public void addProduct(String product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }
    public void listProducts() {
        System.out.println("Available Products: " + products);
    }
}