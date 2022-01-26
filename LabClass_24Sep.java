//1. Define a class shape2D with dimension1, dimension2, name of the shape, colour.
//        Define one area() to calculate area of that shape.
//        There will be one method Display() which one    display all the specification of the shape including area.
//        Make 4 objects
//        a. Red coloured rectangle with length 12unit breadth 9unit
//
//        b. Black coloured square with length 6unit.
//
//        c. Green coloured square with 5unit.
//
//        d. White coloured rectangle with length 6units and breadth 7 units.
//
//
//        2. Find the maximum increment in a sequence of integers.
//
//        In an array some user given non-negative integers are given. The program will find the maximum increment between two numbers.


package com.mandalSuman;

class Shape2D {
    double dimension1;
    double dimension2;
    String shapeName;
    String colour;
    double area_res;

    Shape2D(String name,String clr,double d1){
        shapeName = name;
        colour = clr;
        dimension1 = d1;
        dimension2 = 1;
    }

    Shape2D(String name,String clr,double d1,double d2){
        shapeName = name;
        colour = clr;
        dimension2 = d2;
        dimension1 = d1;

    }

    void area(double dimension1,double dimension2){

        area_res = dimension1 * dimension2;
    }

    void area(double dimension1){
        area_res = dimension1 * dimension1;
    }

    void display(){

            System.out.println(colour+" colour "+shapeName+" has length "+dimension1+" unit and area of "+area_res+" square unit") ;
    }
}

class LabClass_24Sep{
    public static void main(String[] args){

        Shape2D object_1 = new Shape2D("Rectangle","Red",12.0,9.0);
        Shape2D object_2 = new Shape2D("Square","Black",6.0);
        Shape2D object_3 = new Shape2D("Square","Green",5.0);
        Shape2D object_4 = new Shape2D("Rectangle","white",6.0,7.0);

        object_1.area(12,9);
        object_2.area(6);
        object_3.area(5);
        object_4.area(6.0,7);


        System.out.println();
        object_1.display();
        object_2.display();
        object_3.display();
        object_4.display();
    }
}

//Output -
//
//    Red colour Rectangle has length 12.0 unit and area of 108.0 square unit
//        Black colour Square has length 6.0 unit and area of 36.0 square unit
//        Green colour Square has length 5.0 unit and area of 25.0 square unit
//        white colour Rectangle has length 6.0 unit and area of 42.0 square unit
//
//        Process finished with exit code 0
