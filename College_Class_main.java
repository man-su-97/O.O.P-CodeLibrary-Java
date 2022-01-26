package com.mandalSuman;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class College{
    int clg_id;
    String clg_name;
    String clg_addrs;

    Student[] student_arr;
    int no_of_student=0;
    int max_student;
    int cse ,it,bt,ece= 0;

    College(int c_id,String c_nm,String clg_adrs,int mx_st){
        clg_id = c_id;
        clg_name = c_nm;
        clg_addrs = clg_adrs;
        max_student = mx_st;
        student_arr = new Student[max_student];
    }
    boolean verify(Student s1){
        return s1.twlv_marks >= 60 && s1.ten_marks >= 60 && s1.jee_rank < 80000;

    }
    boolean payment(boolean pay){
        return pay;
    }
    void admission(Student obj){
        if(obj.steam_optd.equals("C.S.E")){
            cse++;
        }
        else if(obj.steam_optd.equals("I.T")){
            it++;
        }
        else if (obj.steam_optd.equals("E.C.E")){
            ece++;
        }
        else{
            bt++;
        }
        student_arr[no_of_student] = obj;
        no_of_student++;

    }
    void display(){
        for(int i=0;i < no_of_student;i++){
            System.out.println(student_arr[i].st_name+" you are admitted in "+student_arr[i].steam_optd);
        }
    }
    void student_count(){
        System.out.println("C.S.E - "+cse+" I.T - "+it+" E.C.E - "+ece+" B.T - "+bt);
    }
}

class Student{
    String st_name;
    int jee_rank;
    String steam_optd;
    int adhar_no;
    int ten_marks;
    int twlv_marks;
    boolean pay;
    Student(String s_nm,int j_r,String s_op,int a_n,int t_n,int tw_n,boolean pm){
        st_name = s_nm;
        jee_rank = j_r;
        steam_optd = s_op;
        adhar_no = a_n;
        ten_marks = t_n;
        twlv_marks = tw_n;
        pay = pm;
    }
}

class College_Class_main {


    public static void main(String[] args) throws IOException {
        String name;
        int jee_rank;
        String steam;
        int adhar_no;
        int twlv_number;
        int ten_number;
        boolean payment;


        College c1 = new College(121,"B.I.T","Kolkata",100);

        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        while(true) {
            System.out.println("1: Admit");
            System.out.println("2: Display");
            System.out.println("3: Dept Wise Student Count");

            System.out.println("Enter your choice");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Name");
                    name = reader.readLine();
               //     scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                    System.out.println("Enter Jee Rank");
                    jee_rank = scan.nextInt();
                    System.out.println("Enter Twelve Marks");
                    twlv_number = scan.nextInt();
                    System.out.println("Enter ten's Marks");
                    ten_number = scan.nextInt();
                    System.out.println("Enter adhar number");
                    adhar_no = scan.nextInt();
                    System.out.println("Payment ");
                    payment = scan.nextBoolean();
                    System.out.println("Steam opted");
                    steam = scan.next();
             //       scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                    Student obj = new Student(name, jee_rank, steam, adhar_no, ten_number, twlv_number, payment);
                 //   System.out.println("a "+obj.st_name+"b"+ obj.jee_rank+"c "+obj.steam_optd);
                    if (c1.verify(obj)) {
                        if (c1.payment(obj.pay)) {
                            c1.admission(obj);
                        }
                    }
                    else{
                        System.out.println("You are not eligible");
                    }
                    break;

                case 2:
                    c1.display();
                    break;

                case 3:
                    c1.student_count();
                    break;

                default:
                    System.out.println("Invalid choice !");
            }
        }


    }
}

//
//output : -
//
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        1
//        Enter Student Name
//        Suman Mandal
//        Enter Jee Rank
//        7585
//        Enter Twelve Marks
//        85
//        Enter ten's Marks
//        88
//        Enter adhar number
//        457294494
//        Payment
//        true
//        Steam opted
//        C.S.E
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        1
//        Enter Student Name
//        Sujan Mandal
//        Enter Jee Rank
//        854
//        Enter Twelve Marks
//        88
//        Enter ten's Marks
//        75
//        Enter adhar number
//        54949494
//        Payment
//        true
//        Steam opted
//        I.T
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        1
//        Enter Student Name
//        Sujata Mahajan
//        Enter Jee Rank
//        4844
//        Enter Twelve Marks
//        85
//        Enter ten's Marks
//        75
//        Enter adhar number
//        848445
//        Payment
//        true
//        Steam opted
//        E.C.E
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        1
//        Enter Student Name
//        Saikat Mandal
//        Enter Jee Rank
//        8484
//        Enter Twelve Marks
//        85
//        Enter ten's Marks
//        75
//        Enter adhar number
//        9594844
//        Payment
//        true
//        Steam opted
//        B.T
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        1
//        Enter Student Name
//        Sayan Saha
//        Enter Jee Rank
//        9494
//        Enter Twelve Marks
//        85
//        Enter ten's Marks
//        85
//        Enter adhar number
//        5548448
//        Payment
//        true
//        Steam opted
//        I.T
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        2
//        Suman Mandal you are admitted in C.S.E
//        Sujan Mandal you are admitted in I.T
//        Sujata Mahajan you are admitted in E.C.E
//        Saikat Mandal you are admitted in B.T
//        Sayan Saha you are admitted in I.T
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice
//        3
//        C.S.E - 1 I.T - 2 E.C.E - 1 B.T - 1
//        1: Admit
//        2: Display
//        3: Dept Wise Student Count
//        Enter your choice

//
//            Bulbul Mukherjee3:46 PM
//            If ( ch is yes)
//            X[i ] = new Student( " Abc", 12);
//            Bulbul Mukherjee3:48 PM
//            Student X[]
//            X= new Student [size];