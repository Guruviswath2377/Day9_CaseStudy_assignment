package com.example.ecommerce;
public class Payment {
    public void processPayment(String product) {
        System.out.println("Payment processed for: " + product);
    }
    public void refundPayment(String product) {
        System.out.println("Payment refunded for: " + product);
    }
}