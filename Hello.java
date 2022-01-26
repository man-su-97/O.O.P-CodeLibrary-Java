//package com.company;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int t=sc.nextInt();
//        int sum=0;
//        double ans=0;
//        int mul=1;
//        try{
//            for(int i=0;i<t;i++){
//                sum+=arr[i];
//                mul=mul*arr[i];
//            }
//            ans=Math.floor(sum/mul);
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Division by zero!");
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Number of terms are more than the array size!");
//        }
//        catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}