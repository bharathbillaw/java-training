package com.company;
import java.util.Scanner;

public class Time {
    public int days,hours,minutes,seconds;

    Time(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int seconds_in = in.nextInt();

        days = (int) ( seconds_in/(60*60*24) );
        seconds = seconds_in - (days*(60*60*24));
        hours = (int) seconds /(60*60);
        seconds = seconds - (hours * (60*60));
        minutes = (int) (seconds/60);
        seconds = seconds - (minutes*60);

    }

    public void printOnlyDays(){
        float all_days;
        all_days = days + (float)  (hours/24) +(float)  minutes/(60*24) +(float)  seconds/(60*60*24);
        System.out.println(all_days + " days");
    }

    public void printOnlyHours(){
        float all_days;
        all_days = days*24 +  hours +(float)  minutes/(60) +(float)  seconds/(60*60);
        System.out.println(all_days + " hours");
    }

    public void printOnlyMinutes(){
        float all_days;
        all_days = days*24*60 +  hours*60 + minutes +(float)  seconds/(60);
        System.out.println(all_days + " minutes");
    }

    public void printOnlySeconds(){
        int all_days;
        all_days = days*24*60*60 +  hours*60*60 + minutes*60 + seconds ;
        System.out.println(all_days);
    }
}
