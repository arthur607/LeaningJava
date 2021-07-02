package com.company.enumeracao;

import entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1000, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;


    }
}
