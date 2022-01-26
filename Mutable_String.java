package com.mandalSuman;

public class Mutable_String {
    public static void main(String[] args) {

        String str_1 = "Hello!";
        //create a new object after joining two string str_1 and world
        str_1 = str_1 + "World";

        //stringbuffer concat and save in same original string location
        StringBuffer  str_2 = new StringBuffer("Good");
        //modifies the original object str_2 and appends the new string, new object is not created
        str_2.append(" Afternoon");
        //printing part
        System.out.println(str_1);
        System.out.println(str_2);
    }
}
