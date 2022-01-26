package com.mandalSuman;

import java.util.Scanner;

class Pallindrome {
    public static void main(String[] args) {
        StringBuilder toBeChecked;
        StringBuilder temp = new StringBuilder() ;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        toBeChecked= new StringBuilder(sc.nextLine());

        temp.append(toBeChecked) ;

         temp.reverse();


        int p = toBeChecked.toString().compareTo(temp.toString());
        System.out.println("p: "+p);

        if (toBeChecked.toString().equals(temp.toString())) {
            System.out.println("Its a Pallindrome");
        }
        else
            System.out.println("Not a Pallindrome");
    }

}

//    Enter a String
//    LOL
//    Its a Pallindrome