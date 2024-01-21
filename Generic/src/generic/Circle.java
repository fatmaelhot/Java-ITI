package generic;

import java.util.Scanner;


    public class Circle extends shape {
    private double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        // Replace this line with Java graphics library equivalent
        System.out.println("Drawing a circle");
        
            
    }
    public void setRadiusFromInput(Scanner in) {
        System.out.print("Enter radius for the circle: ");
        radius = in.nextDouble();
    }
}


