package com.mandalSuman;

class Human{
    static int id;
    String name;

    Human(String nm,int x){
        name = nm;
        id = x;
    }

    void writing(Pen ob1){

        System.out.println(ob1.product_name);
    }
}
class Pen{
    static String brand_name;
    String product_name;
    String ink_color;
    String ink_type;
    int pen_id ;
    Pen(String bm,String pm,String ic,String it,int pid){
        brand_name = bm;
        product_name = pm;
        ink_color = ic;
        ink_type = it;
        pen_id = pid;

    }

}
 class Associativity {
     public static void main(String[] args) {

         Human h1 = new Human("Suman",1);
         Human h2 = new Human("Sujan",2);

         Pen p1 = new Pen("Linc","Ocean","Blue","Gel",1);


        h2.writing(p1);
     }
}
