package com.mandalSuman;


class Employee {
    String name;
    int age;

    Employee(String nm, int ag) {
        name = nm;
        age = ag;
    }

    void display() {
        System.out.print(" "+name+" "+"age: "+age+" ");
    }
    void service(){
        System.out.println("will let you know");
    }
}

class Worker extends Employee {
    int hoursWorked;
    int salaryperhour;
    String desig = "Worker";

    Worker(String nm,int ag,int hrwrk,int salph){
        super(nm,ag); //calling of super class
        hoursWorked = hrwrk;
        salaryperhour = salph;
    }
    int totalSalary() {
        return (hoursWorked * salaryperhour);
    }
    void display(){
        System.out.print(desig);
        super.display();
        System.out.println(" salary: "+totalSalary());

    }
}

class Manager extends Employee {
    int salary;
    String department;
    String desig = "Manager";

    Manager(String nm,int ag,int sal,String dept){
        super(nm,ag); //calling of super class
        salary = sal;
        department = dept;
    }

    void display(){
        System.out.print(desig);
        super.display();
        System.out.print(" salary: "+salary +" Department: "+department);

    }
}



class Test_inheritance_l {
    public static void main(String[] args) {



        Worker w1 = new Worker("Ramlal", 30, 8, 100);
        Manager m1 = new Manager("Jethalal", 35, 12545, "Production");

        w1.display();


        m1.display();

    }
}


//    Worker Ramlal age: 30  salary: 800
//    Manager Jethalal age: 35  salary: 12545 Department: Production