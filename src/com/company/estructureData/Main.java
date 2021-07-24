package com.company.estructureData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <equalsAndHashCode> carros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many cars you want add:");
        int number = sc.nextInt();

        for (int i =0; i<number;i++){

            carros.add(new equalsAndHashCode(sc.nextLine()));
            System.out.println(carros.get(i).marca);
        }
       // System.out.println(carros.contains(new equalsAndHashCode("ford")));

        Client c1 = new Client("arthur", "arthur@gmail.com");
        Client c2 = new Client("arthur", "arthur@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }



}
