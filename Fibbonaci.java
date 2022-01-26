//4 Write a program in Java to create Fibonacci series.

package com.mandalSuman;

public class Fibbonaci {
    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }
    }
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
}

//Fibonacci Series of 10 numbers: 0 1 1 2 3 5 8 13 21 34