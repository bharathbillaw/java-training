package com.company;
import java.util.Scanner;

public class Time {
    public int days;
    public int hours;
    public int minutes;
    public int seconds;

    Time(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in seconds:");
        int secondsin = in.nextInt();
        days = (int) ( secondsin/(60*60*24) );
        seconds = secondsin - (days*(60*60*24));
        hours = (int) seconds /(60*60);
        seconds = seconds - (hours * (60*60));
        minutes = (int) (seconds/60);
        seconds = seconds - (minutes*60);
    }

    public void printOnlyDays(){
        float buff;
        buff = days + (float)  (hours/24) +(float)  minutes/(60*24) +(float)  seconds/(60*60*24);
        System.out.println(buff + " days");
    }

    public void printOnlyHours(){
        float buff;
        buff = days*24 +  hours +(float)  minutes/(60) +(float)  seconds/(60*60);
        System.out.println(buff + " hours");
    }

    public void printOnlyMinutes(){
        float buff;
        buff = days*24*60 +  hours*60 + minutes +(float)  seconds/(60);
        System.out.println(buff + " minutes");
    }

    public void printOnlySeconds(){
        int buff;
        buff = days*24*60*60 +  hours*60*60 + minutes*60 + seconds ;
        System.out.println(buff);
    }
}
