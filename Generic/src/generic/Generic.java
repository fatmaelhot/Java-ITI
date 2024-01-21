package generic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generic {
    public static void drawShapes(List<? extends shape> shapeList) {
        System.out.println("Drawing shapes from the list:");
        for (shape shape : shapeList) {
            shape.draw();
        }
    }

    public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

        List<shape> shapesList = new ArrayList<>();
        List<Rectangle> rectanglesList = new ArrayList<>();

        char choice;
        int numShapes;

        System.out.print("Enter the number of shapes you want to create: ");
        numShapes = scanner.nextInt();

        for (int i = 0; i < numShapes; ++i) {
            System.out.print("Enter 'C' for Circle, 'R' for Rectangle: ");
            choice = scanner.next().charAt(0);

            shape shape;
            switch (choice) {
                case 'C' -> {
                    shape = new Circle();
                    ((Circle) shape).setRadiusFromInput(scanner);
                }
                case 'R' -> shape = new Rectangle();
                default -> {
                    System.err.println("Invalid choice");
                    --i;
                    continue;
                  }
            }
        System.out.println("Enter information for shape " + (i + 1) + ":");
            shape.input(scanner, shape);

            if (shape instanceof Rectangle rectangle) {
                rectanglesList.add(rectangle);
            } else {
                shapesList.add(shape);
            }
        }

        // Testing the drawShapes method with the two lists
        drawShapes(shapesList);
        drawShapes(rectanglesList);
    }
     
}

    
    

