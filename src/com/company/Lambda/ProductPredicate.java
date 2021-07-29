package com.company.Lambda;

import java.util.function.Predicate;

public class ProductPredicate  implements Predicate<Product> {
    @Override                     //IMPLEMENTAÇÃO DE INTERFACE
    public boolean test(Product teste) {
        return teste.getPrice() <= 100;
    }
}
