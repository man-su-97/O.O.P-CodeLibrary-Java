//2. Write a java program to validate a password with following properties (try without using regex package):
//        a. Password length must be at least 8 characters
//        b. Password must contain at least one lowercase character
//        c. Password must contain at least one uppercase character
//        d. Password must contain at least one numeric character
//        e. Password must contain at least one of the following characters: !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
//        f. The first and last characters must not be the numbers

package com.mandalSuman;

import java.util.Scanner;

class Passwd_validator {

     static boolean isValid(String passwd){
         boolean valid = true;

        if(!(passwd.length() >= 8)){
            valid = false;
        }

        if (passwd.contains(" ")){
            valid = false;
        }

        if (!(passwd.contains("@") || passwd.contains("#")
                || passwd.contains("!") || passwd.contains("~")
                || passwd.contains("$") || passwd.contains("%")
                || passwd.contains("^") || passwd.contains("&")
                || passwd.contains("*") || passwd.contains("(")
                || passwd.contains(")") || passwd.contains("-")
                || passwd.contains("+") || passwd.contains("/")
                || passwd.contains(":") || passwd.contains(".")
                || passwd.contains(", ") || passwd.contains("<")
                || passwd.contains(">") || passwd.contains("?")
                || passwd.contains("|"))) {
            valid = false;
        }


        if (true) {
            int count = 0;

            for (int i = 65; i <= 90; i++) {

                char c = (char)i;

                String str1 = Character.toString(c);
                if (passwd.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                valid = false;
            }
        }

        if (true) {
            int count = 0;

            for (int i = 90; i <= 122; i++) {

                char c = (char)i;
                String str1 = Character.toString(c);

                if (passwd.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                valid = false;
            }
        }

        return valid;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Password");
        String str = scan.nextLine();

        if (isValid(str)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}

// Output -
//    Enter your Password
//        SumanMandal15135@##$cn
//        Valid Password