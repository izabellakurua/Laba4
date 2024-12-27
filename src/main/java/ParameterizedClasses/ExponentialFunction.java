package ParameterizedClasses;

public class ExponentialFunction implements Function {
    private final double a, b;

    public ExponentialFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double compute(double x) {
        return a * Math.exp(x) + b;
    }

    @Override
    public double getLowerBound() {
        return 0;
    }

    @Override
    public double getUpperBound() {
        return 0;
    }

    @Override
    public Object apply(Object o) {
        return null;
    }
}