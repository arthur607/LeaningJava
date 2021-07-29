package com.company.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 300.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("table", 100.00));
        list.add(new Product("notebook", 900.00));

        Predicate<Product> pred = p -> p.getPrice() >= 100;
        //list.removeIf(product -> product.getPrice() >= 100);
        //list.removeIf(new ProductPredicate());                    //implementando interface
       // list.removeIf(Product :: staticProductPredicate);         //referenciando método estático da classe com lambda
       // list.removeIf(Product :: NostaticProductPredicate);       //referenciando método da classe com lambda
          list.removeIf(pred);                                      //intanciando função lambda


        for (Product p : list) {
            System.out.println(p);
        }
    }

}
