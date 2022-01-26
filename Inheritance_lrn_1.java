package com.mandalSuman;

interface Stack{

    void push(int item);
    int pop();
}


interface queue{
    void additem(int item);
    void deleteitem();
}



class client1 implements Stack, queue
{
    int[] arr;
    int top;
    int front;
    int rear;
    int capacity;
    client1()
    {   rear = -1;
        front = 0;
        top = -1;
        arr = new int[5];
        capacity = 5;
    }
    client1(int a)
    {
        rear = -1;
        front = 0;
        top = -1;
        arr = new int[a];
        capacity = a;
    }
    public  void additem(int obj){
        if (rear == capacity -1)
        {
            System.out.println("Queue Overflow!");
        }
        else
        {
            rear = rear +1;
            arr[rear]=obj;
        }
    }


    public  void deleteitem(){
        int data;
        if (front == -1 || front > rear)
        {
            System.out.println("Queue underflow!");
        }
        else
        {
            data = arr[front];
            System.out.println(data);
            front++;
        }
    }
    public void push(int obj) {
        if(top<capacity-1)
        {
            top++;
            arr[top] = obj;

        }
        else
        {
            System.out.println("Stack Overflow!");
        }

    }
    public int pop() {
        int obj = 0;
        if(top>=0)
        {
            obj = arr[top];
            top --;
        }
        else
        {
            System.out.println("Stack Underflow!");
        }
        return obj;
    }
}

class client2 implements Stack
{
    int[] arr;
    int top;
    int capacity;
    client2()
    {
        top = -1;
        arr = new int[5];
        capacity = 5;
    }
    client2(int a)
    {
        top = -1;
        arr = new int[a];
        capacity = a;
    }
    public void push(int obj) {
        if(top<capacity-1)
        {
            top++;
            arr[top] = obj;

        }
        else
        {
            int c = capacity;
            capacity = capacity*2;
            System.out.println("capacity is been doubled : " + capacity);
            int temp[];
            temp = new int[capacity];
            for(int i = 0; i < c; i++)
            {
                temp[i] = arr[i];
            }
            arr = temp;
            top++;
            arr[top] = obj;
        }

    }
    public int pop() {
        int obj = 0;
        if(top>=0)
        {
            obj = arr[top];
            top --;
        }
        else
        {
            System.out.println("Stack underflow!");

        }
        return obj;
    }


}

class main1
{
    public static void main(String[] args) {
        client2 obj_2 = new client2(3);
        obj_2.push(200);
        obj_2.push(100);
        obj_2.push(50);
        obj_2.push(25);
        System.out.println(obj_2.pop());
        System.out.println(obj_2.pop());
        System.out.println(obj_2.pop());
        System.out.println(obj_2.pop());



        client1 obj_1 = new client1(2);
        obj_1.additem(500);
        obj_1.additem(700);
        obj_1.deleteitem();
        obj_1.deleteitem();
        obj_1.deleteitem();
    }
}