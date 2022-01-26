package com.mandalSuman;

import java.util.LinkedList;

class LinkedListMain {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1);
        l1.addFirst(5);
        l1.addLast(40);
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
        l1.set(1,50);
        System.out.println(l1);


    }
}
