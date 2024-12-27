package ParameterizedClasses;

import java.util.function.Function;

public interface Functional<T extends Function> {
    double evaluate(T function);
}