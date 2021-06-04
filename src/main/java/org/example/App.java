package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int P = in.nextInt();
        System.out.print("What is the rate? ");
        float r = in.nextFloat();
        double rate = r / 100.0;
        System.out.print("What is the number of years? ");
        int t = in.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = in.nextInt();

        double A = P * Math.pow(1.0 + rate / n, n * t);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", P, r, t, n, A);

    }
}
