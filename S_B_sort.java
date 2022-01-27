//1. Write one menu driven program to do bubble sort and selection sort.
//        There will be one class containing one integer array, Input() Display(), Bubble() and Selection ().
//        Menu will be there in main() within an infinite loop to call the method as needed. Input() will input the array elements, Display () will print the array elements,
//        Bubble () will do the bubble sort, Selection () will do the selection sort.

package com.mandalSuman;

import java.util.Scanner;

class S_B_sort {
    int n;
    Scanner scan = new Scanner(System.in);
    int arr[];

    void input(int size){
        n =  size;
        arr = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
    }
    void display(){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    void bubbleSort(){

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

    void selection_sort()
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

class Test{
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        S_B_sort obj1 =  new S_B_sort();

        System.out.println("1: Input()");
        System.out.println("2: Display()");
        System.out.println("3: Bubble()");
        System.out.println("4: Selection()");


        while(true){
            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the array size");
                    int size = scan.nextInt();
                    obj1.input(size);
                    break;

                case 2:
                    obj1.display();
                    break;

                case 3:
                    obj1.bubbleSort();
                    break;

                case 4:
                    obj1.selection_sort();
                    break;

                default:
                    System.out.println("Invalid choice !");
            }
        }

    }
}


//Output -
//        1: Input()
//        2: Display()
//        3: Bubble()
//        4: Selection()
//        Enter your choice
//        1
//        Enter the array size
//        5
//        Enter array element
//        5 4 2 1 3
//        Enter your choice
//        4
//        Enter your choice
//        2
//        1 2 3 4 5
//        Enter your choice