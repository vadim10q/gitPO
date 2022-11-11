package com.luxygod.learn.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsClass {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(
                            "test.txt");
            System.out.println("File ready");
        } catch (FileNotFoundException e) {
            System.out.println("Input problem");
            System.out.println(e);
        }




    }
}
