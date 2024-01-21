import java.util.Scanner;
import java.util.function.Function;
class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Celsius degree: ");
        double celsius = scanner.nextDouble();

        Function<Double, Double> celsiusToFahrenheit = c -> (c * 9 / 5) + 32;
        double fahrenheit = convertTemperature(celsius, celsiusToFahrenheit);

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
    }
    private static double convertTemperature(double input, Function<Double, Double> conversionFunction) {
        return conversionFunction.apply(input);
    }
}

