package ParameterizedClasses;

public class SinFunction implements Function {
    private final double a, b;
    private final double lower, upper;

    public SinFunction(double a, double b, double lower, double upper) {
        this.a = a;
        this.b = b;
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public double compute(double x) {
        if (x < lower || x > upper) {
            throw new IllegalArgumentException("x вне пределов");
        }
        return a * Math.sin(b * x);
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