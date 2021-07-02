package com.company.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<String> listaa;
        listaa = new ArrayList<>();

        listaa.add("garcia");
        listaa.add("rodrigues");

        listaa.add(2,"arthur");
        listaa.remove(1);
        System.out.println(listaa.size());
        for (String x : listaa){
            System.out.println(x);
        }
        System.out.println("----------------------------------");
        listaa.removeIf(x -> x.charAt(0) == 'a');     //removing all indices with initial char 'a'.
        for (String x : listaa){
            System.out.println(x);
        }
    }


}
