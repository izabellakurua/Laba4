package ParameterizedClasses;

public class SumFunctional implements Functional<Function> {
    @Override
    public double evaluate(Function function) {
        return function.compute(function.getLowerBound()) + function.compute(function.getUpperBound()) + function.compute((function.getLowerBound()+function.getUpperBound())/2);
    }
}