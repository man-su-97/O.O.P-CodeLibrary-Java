package com.mandalSuman;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int n;
        int status = 1;
        int num = 3;
        //For capturing the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        //The entered value is stored in the var n
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println("First "+n+" prime numbers are:");
            //2 is a known prime number
            System.out.println(2);
        }

        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}


//    Enter the value of n:
//        10
//        First 10 prime numbers are:
//        2
//        3
//        5
//        7
//        11
//        13
//        17
//        19
//        23
//        29
//
//        Process finished with exit code 0