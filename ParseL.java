package com.mandalSuman;

public class ParseL {
    static void modify(Integer x){
        int a = x;
        a = a+5;
        x = a;
    }
    public static void main(String[] args) {
        Integer a;

        a = Integer.parseInt("15");
        System.out.println(a);

        Integer y = 5;
        modify(y);
        System.out.println(y);


    }

}
