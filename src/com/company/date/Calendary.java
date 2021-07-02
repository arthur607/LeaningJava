package com.company.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendary {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY ,4);      //add hour in  variable d
        d = cal.getTime();

        System.out.println(d);


        int minutes = cal.get(Calendar.MINUTE);       //acess minutes of date
        System.out.println("minutes: " + minutes);

        int hour = cal.get(Calendar.HOUR);            //acess hour of date
        System.out.println("hour: " + hour);

        int month = cal.get(Calendar.MONTH);            //acess hour of date
        System.out.println("month: " + month);

    }
}
