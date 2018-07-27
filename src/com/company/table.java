package com.company;

import java.util.Scanner;

public class table {
    int var;
    table(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to print table:");
        var = in.nextInt();
    }

    void printTable(){
        for(int i=1; i<=10; i++){
            System.out.println(this.var+"*"+i+"="+this.var*i);
        }
    }
}
