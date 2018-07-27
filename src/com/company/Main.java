/* Program to convert entered seconds into days,hours,minutes and seconds  3,07,58,400 */

package com.company;
public class Main {
    public static void main(String[] args){

        Time time1 = new Time();
        time1.printOnlyDays();
        time1.printOnlyHours();
        time1.printOnlyMinutes();
        // a.printOnlySeconds();
        System.out.println(time1.days +" days,"+ time1.hours +" hours,"+  time1.minutes +" minutes "+  time1.seconds +" seconds.");
    }
}
