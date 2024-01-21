import java.util.Scanner;

public class Complex<T extends Number> {
    private T real;
    private T imag;

    public Complex() {
        this.real = (T) new Integer(0);
        this.imag = (T) new Integer(0);
    }

    public Complex(T real, T imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex<T> add(Complex<T> other) {
        T resultReal = (T) new Double(this.real.doubleValue() + other.real.doubleValue());
        T resultImag = (T) new Double(this.imag.doubleValue() + other.imag.doubleValue());
        return new Complex<>(resultReal, resultImag);
    }

    public Complex<T> subtract(Complex<T> other) {
        T resultReal = (T) new Double(this.real.doubleValue() - other.real.doubleValue());
        T resultImag = (T) new Double(this.imag.doubleValue() - other.imag.doubleValue());
        return new Complex<>(resultReal, resultImag);
    }

    public void print() {
        if (imag.doubleValue() >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + "" + imag + "i");
        }
    }
}
