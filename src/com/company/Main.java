package com.company;

import entities.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        double[] vect = new double[n];
//
//        for (int i = 0; i<n; i++ ){
//            vect[i] = sc.nextDouble();
//        }
//        int sum = 0;
//        for (int i =0;i<n;i++){
//            sum += vect[i];
//        }
//        double avg = sum / n ;
//        System.out.println(avg);


        Product[] vect = new Product[n];

        for (int i = 0; i< vect.length; i++ ){
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();

            vect[i] = new Product(name, price);
        }

        System.out.println(vect[0].getPrice());



        double sum = 0;
        for (int i =0;i<vect.length;i++){
            sum += vect[i].getPrice();
       }
        System.out.println(sum);

//        double avg = sum / n ;
//        System.out.println(avg);

    }
}
