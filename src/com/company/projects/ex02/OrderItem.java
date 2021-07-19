package com.company.projects.ex02;

public class OrderItem {
    private int quantity;
    private Double price;
    private Product product;

    public double subTotal(){
      return price * quantity;
    }

    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
