import java.util.Scanner;

public class ComplexNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();

        Complex<Double> c1 = new Complex<>(real1, imag1);
        Complex<Double> c2 = new Complex<>(real2, imag2);

        Complex<Double> sum = c1.add(c2);
        Complex<Double> diff = c1.subtract(c2);

        System.out.print("c1 = ");
        c1.print();
        System.out.println();

        System.out.print("c2 = ");
        c2.print();
        System.out.println();

        System.out.print("Sum of c1 and c2 = ");
        sum.print();
        System.out.println();

        System.out.print("Difference of c1 and c2 = ");
        diff.print();
        System.out.println();
    }
}
