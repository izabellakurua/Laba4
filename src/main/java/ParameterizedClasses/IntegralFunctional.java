package ParameterizedClasses;

public class IntegralFunctional implements Functional<Function> {
    private final int numRectangles;

    public IntegralFunctional(int numRectangles) {
        this.numRectangles = numRectangles;
    }

    @Override
    public double evaluate(Function function) {
        double lower = function.getLowerBound();
        double upper = function.getUpperBound();
        double width = (upper - lower) / numRectangles;//Вычисляется ширина каждого прямоугольника
        double sum = 0; //будет хранить сумму площадей всех прямоугольников

        for (int i = 0; i < numRectangles; i++) {//проходит по всем прямоугольникам
            double x = lower + i * width; //используется для вычисления высоты прямоугольника
            sum += function.compute(x) * width;
        }

        return sum;
    }
}