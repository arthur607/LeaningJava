package com.company.projects.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Program {
    public static void main(String[] args) throws ParseException {
        Comment c1 = new Comment("first comment");       //starting object
        Comment c2 = new Comment("second comment");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  //mask of time
        Calendar cal;
        sdf.getCalendar();
        Post p1 = new Post(Calendar.getInstance(), "traveling,", "traveling to BR", "12");

        p1.addComments(c1);          //instancing commentary in object post

        System.out.println(p1.getMoment());
    }
}
