package com.company.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       try {
           String[] vect = sc.nextLine().split(" ");
           int p = sc.nextInt();
           System.out.println(vect[p]);
       } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
           e.printStackTrace();
       }
       finally {
           System.out.println("end of program");
       }
    }
}
