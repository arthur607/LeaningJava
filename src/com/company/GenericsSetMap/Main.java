package com.company.GenericsSetMap;

import java.util.Scanner;

public class Main {
                            // generics permite parametrizar os tipos, facilitando reuso e performance
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintServiceGeneric<Integer> arthurInt = new PrintServiceGeneric<>();   //instancing type generics
        PrintServiceGeneric<String> arthurString = new PrintServiceGeneric<>();

        arthurString.getTesteComGetterESetter();

        System.out.print("how many values?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            arthurInt.addValue(value);
        }
        arthurInt.print();
        System.out.println("first: " + arthurInt.first());


        arthurString.addValue("arthur em string");
        System.out.println(arthurString.first());
    }
}
