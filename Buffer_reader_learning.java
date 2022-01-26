package com.mandalSuman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buffer_reader_learning {
    public static void main (String[] args) throws IOException {
        int var1;
        double var2;
        char var3;
        String var4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //   (new BufferedReader(new InputStreamReader(System.in))).read();
        var1 = Integer.parseInt(br.readLine());
        System.out.println(var1+10);

        var2 =  Double.parseDouble((br.readLine()));
        System.out.println(var2+10.5);

        var3 =(char)br.read();
        System.out.println(var3);

       // var3 = (char)(new BufferedReader(new InputStreamReader(System.in))).read();

        var4 = (String)(new BufferedReader(new InputStreamReader(System.in))).readLine();
        System.out.println(var4);
    }

}


