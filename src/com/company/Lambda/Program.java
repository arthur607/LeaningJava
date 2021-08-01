package com.company.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 300.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("table", 100.00));
        list.add(new Product("notebook", 900.00));

        List<String> UpperNames = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //aplicando upperCaseName em cada elemento da lista

        Function<Product, String> func = p -> p.getName().toUpperCase(Locale.ROOT);

        UpperNames.forEach(System.out :: println);
    }
}
