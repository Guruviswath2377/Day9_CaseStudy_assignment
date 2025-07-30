package com.example.ecommerce;
public class Order {
    public void createOrder(String product) {
        System.out.println("Order created for: " + product);
    }
    public void cancelOrder(String product) {
        System.out.println("Order cancelled for: " + product);
    }
}