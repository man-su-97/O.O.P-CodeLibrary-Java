package com.mandalSuman;


import java.util.Scanner;

class Prob_on_Exception {
    public static void main(String[] args) {
        int n,sum =0,multi =1;
        double res =0;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int t;
        t = sc.nextInt();
        try{

                for(int i=0;i<t;i++){
                    sum+=arr[i];
                    multi=multi*arr[i];
                }
                res =  Math.floor(sum/multi);

        }
        catch(ArithmeticException e) {
            System.out.println("Division by Zero");
        }
        catch(ArrayIndexOutOfBoundsException ea){
            System.out.println("beyond array");
        }
        catch(Exception ec){
            System.out.println(ec.getMessage());
        }

    }

}

//        5
//        2 1 5 3 8
//        7
//        beyond array