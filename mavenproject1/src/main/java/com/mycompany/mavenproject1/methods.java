
package com.mycompany.mavenproject1;

public class methods {
   // Calculator.java

    public static double calculateSquareRoot(double num) throws ExceptionHandling {
        if (num < 0) {
            throw new ExceptionHandling("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculateDivision(double num1, double num2) throws ExceptionHandling {
        if (num2 == 0) {
            throw new ExceptionHandling("Division by zero is not allowed");
        }
        return num1 / num2;
    }

     public static double calculateDifference(double num1, double num2) throws ExceptionHandling {
       if(num1<0){
           throw new ExceptionHandling("negative result is not allowd ");
       }
         return num1 - num2;
    }

 
}
