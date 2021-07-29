package com.company.Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private Double price;
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }
    public  boolean NostaticProductPredicate(){
        return getPrice() <= 100;
    }

}
