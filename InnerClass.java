package com.mandalSuman;

class Outer{

   public class InnerClass {
        int a;
        void display(){
            System.out.println("Inner "+a);
        }
        void set(int x){
            a = x;
        }
    }
}

class MainClass{
    public static void main(String[] args){
        Outer object1 = new Outer();
        Outer.InnerClass object2 = object1.new InnerClass();

        object2.set(5);
        object2.display();
    }
}

