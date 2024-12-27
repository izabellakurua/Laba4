package org.example;

public class EquationHandler {
    private final QuadraticEquation equation;

    public EquationHandler(QuadraticEquation equation) {
        this.equation = equation;
    }

    public double getLargerRoot() {
        double[] roots = equation.solve();
        if (roots.length == 0) {
            throw new IllegalStateException("Нет корней");
        }
        double maxRoot = roots[0];
        for (double root : roots) {
            if (root > maxRoot) {
                maxRoot = root;
            }
        }
        return maxRoot;
    }
}