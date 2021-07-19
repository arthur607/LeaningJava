package com.company.projects.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        Client a = new Client("Arthur", sdf1.parse("06/12/2002"));

        System.out.println("Insert how many products you want:");
        int numProducts = sc.nextInt();

        for (int i = 0;i<numProducts;i++){
            //addProducts
        }
    }
}
