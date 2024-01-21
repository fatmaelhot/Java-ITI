package equations;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface QuadraticRootsFunction extends Function<List<Double>, List<String>> {
    // Custom method to calculate roots based on the list of parameters
    String calculateRoots(Double a, Double b, Double c);

    @Override
    default List<String> apply(List<Double> params) {
        if (params.size() == 3) {
            return List.of(calculateRoots(params.get(0), params.get(1), params.get(2)));
        } else {
            throw new IllegalArgumentException("List must contain three parameters (a, b, c).");
        }
    }
}
    public String calculateRoots(Double a, Double b, Double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Two real and distinct roots: " + root1 + " and " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return "One real and equal root: " + root;
        } else {
            return "No real roots. Roots are complex.";
        }
    }

