package com.company;

/* Program to convert entered seconds into days,hours,minutes and seconds  3,07,58,400 */


public class Main {


    public static void main(String[] args){

        Time a = new Time();



        a.printOnlyDays();
        a.printOnlyHours();
        a.printOnlyMinutes();
        // a.printOnlySeconds();

        System.out.println(a.days +" days,"+ a.hours +" hours,"+  a.minutes +" minutes "+  a.seconds +" seconds.");

    }
}
