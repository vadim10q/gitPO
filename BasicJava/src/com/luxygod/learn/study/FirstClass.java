package com.luxygod.learn.study;

import java.io.IOException;
import  java.util.Scanner;
public class FirstClass {
    public static void main(String[] args) throws IOException {
        //Output
        System.out.println("Hello Java!");
        System.out.println(42);
        System.out.println("\n\tjava" + 42);
        //Enter symbol
        int x;
        try {
            System.out.println("Enter code symbol");
            x = System.in.read();
            System.out.println("code = " + x + "x=" + (char) x);
        }catch(IOException e)
        {e.printStackTrace();}
        //Enter string
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Enter your name");
        System.out.println("Hello " + input);
        //Enter numbers from console
        System.out.println("Enter number");
        Scanner scan2 = new Scanner(System.in);
        int number = scan2.nextInt();
        System.out.println("Yout number is " + number);
}
    }

