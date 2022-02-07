package com.mandalSuman;//generalization and specialization
////
////ABC is a PostGrad student
////
////class Student_t{  //generalization
////   String name;
////}
////
////class UnderGrad extends Student_t{  //specialization
////
////}
////
////class PostGrad extends Student_t {  //specialization
////
////}
////
////
////class Test{
////    public static void main(String[] args) {
////        System.out.println("Hello");
////    }
////}
//..................................................................................................................
//class A{
//    int x =10;
//    void display(){
//        System.out.println(x);
//    }
//    int increment(int j){
//        return j;
//    }
//}
//
//class B extends A{
//
//    String s;
//    B(String ss){
//        s = ss;
//    }
//    void display(){
//        super.display();
//        System.out.println(s);
//    }
//}
//
//class Demo{
//    public static void main(String[] args) {
//        B obj = new B("Computer");
//        obj.display();
//    }
//}
//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

//class Vertebrate {
//
//    void breathe(){
//
//    }
//    void eat(){
//
//    }
//    void movement(){
//
//    }
//}
//
//class Fish extends  Vertebrate{
//
//    void breathe(){
//        System.out.println("By gills");
//    }
//    void eat(){
//        System.out.println("water and land");
//    }
//    void movement(){
//        System.out.println("by legs");
//    }
//}
//
//class Amphibian extends Vertebrate{
//    void breathe(){
//        System.out.println("By gills");
//    }
//    void eat(){
//        System.out.println("land");
//    }
//    void movement(){
//        System.out.println("");
//    }
//
//}
//
//class Bird extends Vertebrate{
//
//    void breathe() {
//        System.out.println("By lungs");
//    }
//    void eat(){
//        System.out.println("from land");
//    }
//    void movement(){
//        System.out.println("by fins ");
//    }
//}
//
//class Mammals extends Vertebrate {
//
//    void breathe() {
//        System.out.println("By gills");
//    }
//
//    void eat() {
//        System.out.println("");
//    }
//
//    void movement() {
//        System.out.println("");
//    }
//
//}
//
//class demo{
//    public static void main(String[] args)
//}