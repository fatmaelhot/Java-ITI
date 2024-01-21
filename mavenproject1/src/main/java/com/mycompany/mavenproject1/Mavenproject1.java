

package com.mycompany.mavenproject1;


public class Mavenproject1 {

    public static void main(String[] args) {
       try {
            double result1 = methods.calculateSquareRoot(25);
            System.out.println("Square Root: " + result1);

            double result2 = methods.calculateDivision(10, 2);
            System.out.println("Division: " + result2);

            double result3 = methods.calculateDifference(5, 4);
            System.out.println("Deferance: " + result3);
        } catch (ExceptionHandling e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
       finally{
           System.out.println("hello");
       }
    }
    }

