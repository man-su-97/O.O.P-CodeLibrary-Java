package com.mandalSuman;

class Excep {
    public static int Div(int a, int  b)throws Exception{
        return a/b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int [] arr = new int [10];
        System.out.println("before excep");

        try{
            System.out.println(Div(a, b));
            //  System.out.println(a/b);
            System.out.println(arr[2]);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ea){
            System.out.println("beyond array");
        }
        catch(Exception ec){
            System.out.println(ec.getMessage());
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("After error");
    }
}
