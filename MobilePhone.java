package com.mandalSuman;

class MobilePhone {
    static int id=0;
    int price;
    String brand_name;
    String model_number;
    int ram_cap;
    int storage;
    String Phone_os;

    MobilePhone(int priceb,String brand_nameb,String model_numberb,int ram_capb,int storageb){
        id++;
        price=priceb;
        brand_name=brand_nameb;
        model_number=model_numberb;
        ram_cap=ram_capb;
        storage=storageb;


    }
    MobilePhone(int price,String brand_name,String model_number,int ram_cap,int storage,String phone_os){
        id++;
        this.price=price;
        this.brand_name=brand_name;
        this.model_number=model_number;
        this.ram_cap=ram_cap;
        this.storage=storage;
        this.Phone_os=phone_os;

    }
    void display(){
        System.out.println("Id- "+id+" "+brand_name+" "+model_number+" "+"Ram- "+ram_cap+" "+"Storage- "+storage+" "+"O.S - "+Phone_os+" "+"Price- "+price);
    }
}

class MobilePhoneTest{
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone(10000,"Nokia","9 Plus",4,64,"Android");
        MobilePhone p2 = new MobilePhone(3000,"Samsung","C3",1,8);
        MobilePhone p3 = new MobilePhone(30000,"Oneplus","Nord 2",8,128,"Android");
        MobilePhone p4 = new MobilePhone(40000,"Apple","Iphone 11",3,128,"IOS");

        p1.display();
        p2.display();
        p3.display();
        p4.display();


    }
}
