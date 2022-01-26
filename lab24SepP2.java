package com.mandalSuman;


import java.util.Scanner;

class lab24SepP2 {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();

        }

//        int temp = arr[1]-arr[0];
//        System.out.println(temp);
        int temp = -1;
        for(int i = 0; i < n-1; i++)
        {

            for(int j = i+1; j < n; j++)
            {
                if(arr[j]>=arr[i]){
                    int check = arr[j]-arr[i];
                    temp = temp > check ? temp : check;
                }
            }
        }
        System.out.println("Ans: "+temp);

    }

}
//
//Output -
//        5
//        5 4 3 2 1
//        Ans: -1

//        6
//        7 2 4 3 4 2
//        Ans: 2

//        4
//        7 5 5 4
//        Ans: 0