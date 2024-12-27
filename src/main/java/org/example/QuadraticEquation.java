package org.example;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] solve() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[0];
        } else if (discriminant == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            double sqrtD = Math.sqrt(discriminant);
            return new double[]{
                    (-b + sqrtD) / (2 * a),
                    (-b - sqrtD) / (2 * a)
            };
        }
    }
}
