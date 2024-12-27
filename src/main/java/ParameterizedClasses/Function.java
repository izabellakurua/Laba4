package ParameterizedClasses;

public interface Function extends java.util.function.Function {
    double compute(double x);
    double getLowerBound();
    double getUpperBound();
}