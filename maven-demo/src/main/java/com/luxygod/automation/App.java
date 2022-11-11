package com.luxygod.automation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException  {
        double x;
        double y;
        double result;
        char op;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scan.next().charAt(0);
        switch(op) {
           case '+': result = plus(x, y);
              break;
           case '-': result = minus(x, y);
              break;
           case '*': result = umnoz(x, y);
              break;
           case '/': result = delit(x, y);
              break;
           default: Error();
              return;
        }
       Result();
       ResultEnd(x, op, y, result);
       GoToFile((int)result);
    }


  public static void GoToFile(int result) throws IOException{
       File file = new File("Example.txt");
       file.createNewFile();
       FileWriter writer = new FileWriter(file); 
       writer.write("Результат - " + result ); 
       writer.flush();
       writer.close();
            }

      public static void ResultEnd(double x, char op, double y, double result)
      {
        System.out.printf(x + " " + op + " " + y + " = " + result);
      }

            public static void doNothing(int u) {
                
            }
     
    public static void Result() {
        
        System.out.printf("The result is given as follows:");
        
    }


     public static void Error() {
        System.out.printf("Error! Enter correct operator");
    }

    public static double plus(double x, double y)
    {
    return x +y;
    }

    public static double minus (double x, double y)
    {
        return x -y;
    }
    public static double umnoz (double x, double y)
    {
        return x * y;
    }
    public static double delit (double x, double y)
    {
        return y / x;
    }
  
}
   
    

    


