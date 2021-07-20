package com.company.projects.ex03;

import com.company.projects.ex03.exceptions.Exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int roomNumber;
    private Date checkIn, checkOut;

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();    //differences by two dates in milliseconds
        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);    //converter milliseconds to days
    }
    public void updateDates(Date checkIn, Date checkOut) throws Exceptions {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new Exceptions("Reservation dates for updates must be futures dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new Exceptions("Reservation dates for updates must be after check-in date");
        }
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }


    @Override
    public String toString(){
        return "Room "
        + roomNumber
        +", check-in: "
        +sdf.format(checkIn)
        +", check-out: "
        +sdf.format(checkOut)
        +", "
        +duration()
        +" nights";
    }


}
