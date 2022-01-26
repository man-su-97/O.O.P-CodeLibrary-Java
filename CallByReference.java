package com.mandalSuman;

class CallByReference {
    public int a;
    CallByReference(int x){
        a = x;
    }
}

class Main_cbf{
    static void modify(int a){
        a =10;

    }
    static void modify(CallByReference obj){
        obj.a = 10;
    }

    public static void main(String[] args) {
        int x = 15;
        modify(x);
        System.out.println(x);
        CallByReference y = new CallByReference(15); //call by reference
        modify(y);
        System.out.println(y.a);
    }
}
