package com.example.ecommerce;
public class EcommerceService {
    private Product product;
    private Order order;
    private Payment payment;
    public EcommerceService(Product product, Order order, Payment payment) {
        this.product = product;
        this.order = order;
        this.payment = payment;
    }
    public void placeOrder(String productName) {
        product.addProduct(productName);
        order.createOrder(productName);
        payment.processPayment(productName);
    }
    public void cancelOrder(String productName) {
        order.cancelOrder(productName);
        payment.refundPayment(productName);
    }
    public void showAllProducts() {
        product.listProducts();
    }
}