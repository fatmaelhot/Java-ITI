/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;
 import java.util.Scanner;
/**
 *
 * @author fatma
 */
public class shape {
   
    protected double point1;
    protected double point2;

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public shape arrowOperator() {
        return this;
    }

    public static void input(Scanner in, shape s) {
        System.out.print("Enter point1: ");
        s.point1 = in.nextDouble();
        System.out.print("Enter point2: ");
        s.point2 = in.nextDouble();
    }

    public static void output(shape s) {
        System.out.println("Point1: " + s.point1 + ", Point2: " + s.point2);
    }
}


