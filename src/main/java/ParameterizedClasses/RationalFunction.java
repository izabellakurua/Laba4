package ParameterizedClasses;

public class RationalFunction implements Function {
    private final double a, b, c, d;


    public RationalFunction(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double compute(double x) {
        if (c * x + d == 0) {
            throw new IllegalArgumentException("Деление на 0 недопустимо");
        }
        return (a * x + b) / (c * x + d);
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