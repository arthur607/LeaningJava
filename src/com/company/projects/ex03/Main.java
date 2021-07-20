package com.company.projects.ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {

            System.out.println("Room number:");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            Reservation reservation = new Reservation(number, checkIn, checkOut);
//                System.out.println(reservation);
//            if (!checkOut.after(checkIn)) {
//                System.out.println("invalid input after date!");
//            } else {
//                Reservation reservation = new Reservation(number, checkIn, checkOut);
//                System.out.println(reservation);
//            }
            System.out.println();
            reservation.updateDates(checkIn,checkOut);
        } catch (InputMismatchException | ParseException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Enter valid dates" + e.getMessage());    //searching message in reservation class
        }

        sc.close();
    }
}
