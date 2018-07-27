package com.company;

/* Write a Java program to print an American flag on the screen. Go to the editor
         Expected Output 34 46 15 9

         * * * * * * ==================================
          * * * * *  ==================================
         * * * * * * ==================================
          * * * * *  ==================================
         * * * * * * ==================================
          * * * * *  ==================================
         * * * * * * ==================================
          * * * * *  ==================================
         * * * * * * ==================================
         ==============================================
         ==============================================
         ==============================================
         ==============================================
         ==============================================
         ==============================================  */


public class Main {

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) System.out.print("* "); // Prints * with a space after it
    }

    public static void printLine(int n) {
        for (int i = 0; i < n; i++) System.out.print("="); // Prints * with a space after it
        System.out.println("\n");
    }

    public static void main(String[] args){

        for(int i=1;i<10;i++){
            if(i%2 != 0) printStar(6);
            else {
                System.out.print(" ");
                printStar(5);
                System.out.print(" ");// prints an extra space
            }
            printLine(34);
        }

        for(int i=0;i<6;i++){
            printLine(46);
        }

    }
}
