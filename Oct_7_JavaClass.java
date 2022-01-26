package com.mandalSuman;

class CopyConstructor{
  public  int a;
  CopyConstructor(int x){
        a = x;
  }
  CopyConstructor(CopyConstructor obj){
      a = obj.a;
  }
}

class Oct_7_JavaClass {

    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor(5);
        System.out.println(c.a);
      //  CopyConstructor  b = c;// shallow copy
        CopyConstructor b = new CopyConstructor(c); //deep copy
        System.out.println(b.a);
        b.a = 15;
        System.out.println(b.a);
        System.out.println(c.a);
      //  System.out.println("Ok,in Main");

    }
}

