package com.company.Lambda;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String>, Consumer<Product>   {    //recebe um product como argumento e retorna uma String

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase(Locale.ROOT);
    }

    @Override
    public void accept(Product product) {

    }
}
