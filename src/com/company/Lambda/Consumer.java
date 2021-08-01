package com.company.Lambda;

public class Consumer implements java.util.function.Consumer<Product>{


    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.10);
    }
}
