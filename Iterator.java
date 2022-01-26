package com.mandalSuman;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("E");
        al.add("I");
        al.add("O");
        al.add("U");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
