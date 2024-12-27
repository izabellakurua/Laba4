package ParameterizedClasses;

public class LinearFunction implements Function {
    private final double a, b;
    private final double lower, upper;

    public LinearFunction(double a, double b, double lower, double upper) {
        this.a = a;
        this.b = b;
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public double compute(double x) {
        if (x < lower || x > upper) {
            throw new IllegalArgumentException("x вне пределов отрезка.");
        }
        return a * x + b;
    }

    @Override
    public double getLowerBound() {
        return lower;
    }

    @Override
    public double getUpperBound() {
        return upper;
    }

    @Override
    public Object apply(Object o) {
        return null;
    }
}