//.5 Write a program in Java which allows a retail store to keep track of the bill amount paid
//        by the customers. The discount is provided on the bill amount as given below:
//
//        Bill Amount      Discount %
//        >=50000                15
//        >=25000                10
//        >=10000                  5
//        >=5000                    2
//        <5000                      0

package com.mandalSuman;

import java.util.Scanner;

public class Retail_Store {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int amount;
        System.out.println("Enter the amount: ");
        amount=sc.nextInt();
        System.out.println("Current amount: " + amount);
        System.out.print("Amount to be paid after discount: ");

        if(amount >= 50000 && amount < 10000) {
            int ans = amount - (amount * 2 / 100);
            System.out.println(ans);
        }
        else if(amount >= 10000 && amount < 25000) {
            int ans = amount - (amount * 5 / 100);
            System.out.println(ans);
        }
        else if(amount >=25000 && amount < 50000){
            int ans = amount - (amount * 10 / 100);
            System.out.println(ans);
        }
        else if(amount >= 50000){
            int ans = amount - (amount * 15 / 100);
            System.out.println(ans);
        }
        else{
            int ans = amount;
            System.out.println(amount);
        }
    }
}

// output -
//    Enter the amount:
//        60000
//        Current amount: 60000
//        Amount to be paid after discount: 51000