package com.company.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        java.util.Date Y1 = sdf1.parse("06/12/2002");
        java.util.Date y2 = sdf2.parse("06/12/2002 23:40:12");

        System.out.println(sdf2.format(Y1));
        System.out.println(sdf2.format(y2));

        java.util.Date x1 = new java.util.Date();               //current date
        System.out.println(sdf2.format(x1));
    }
}
