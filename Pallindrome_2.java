package com.mandalSuman;

import java.util.Scanner;

public class Pallindrome_2 {

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }


    public static void main(String[] args) {
        String str1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        str1 = sc.nextLine();

        if (isPalindrome(str1))

            System.out.println("Its a Pallindrome");
        else
            System.out.println("Not a Pallindrome");


    }
}


//    Enter a String
//    MOM
//    Its a Pallindrome