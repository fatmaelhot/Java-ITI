// MainClass.java
package application;

import equations.QuadraticRootsCalculator;

public class MainClass {
   public static void main(String[] args) {
        QuadraticRootsCalculator calculator = new QuadraticRootsCalculator();
        List<Double> params = List.of(50.0, 50.0, 50.0);
        List<String> result = calculator.apply(params);
        System.out.println(result);
    }
    }

