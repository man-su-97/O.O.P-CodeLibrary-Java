//6. Write a Java program to display the following design pattern by taking the total
//        number of lines as command line argument
//        1
//        2 2
//        3 3 3
//        4 4 4 4

package com.mandalSuman;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}


//    Enter the number of rows:
//        4
//        1
//        2 2
//        3 3 3
//        4 4 4 4