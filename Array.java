package com.mandalSuman;
import java.util.Arrays;

class Array {
    public static void main(String[] args){

        //array creation with size 10 and 5
        int arr[]=new int[10];
        int []arr1 = new  int[5];

        //array declaration
        int arr3[];
        int arr4[];

        //array insertion
        int[] A =new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

        int n =6;

        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");

        arr3 = new int[10];

        Arrays.fill(arr3,5);

        arr4 = arr3 ;
        System.out.println(arr3.length);
        arr4[2] = 7;



        //for each loop
        System.out.println("Array 3");
       for(int x: arr3){
           System.out.print(x+" ");
       }
        //for each loop
       System.out.println("\narray 4");
       for(int x: arr4){
            System.out.print(x+" ");
       }
    }
}

