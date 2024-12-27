package ParameterizedClassesTest;

import ParameterizedClasses.LinearFunction;
import ParameterizedClasses.SinFunction;
import ParameterizedClasses.SumFunctional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumFunctionalTest {

    @Test
    void testEvaluateLinearFunction() {
        SumFunctional sumFunctional = new SumFunctional();
        LinearFunction linearFunction = new LinearFunction(2, 3, 0, 4); // f(x) = 2x + 3, [0, 4]

        double result = sumFunctional.evaluate(linearFunction);// f(0) = 3, f(4) = 2*4+3 = 11, f(2) = 2*2+3 = 7
        assertEquals(3 + 11 + 7, result, 0.001);
    }

    @Test
    void testEvaluateSinFunction() {
        SumFunctional sumFunctional = new SumFunctional();
        SinFunction sinFunction = new SinFunction(1, Math.PI, 0, 1); // f(x) = sin(πx), [0, 1]

        double result = sumFunctional.evaluate(sinFunction);// f(0) = 0, f(1) = sin(π) = 0, f(0.5) = sin(π*0.5) = 1
        assertEquals(0 + 0 + 1, result, 0.001);
    }

    @Test
    void testEvaluateEdgeCases() {
        SumFunctional sumFunctional = new SumFunctional();
        LinearFunction linearFunction = new LinearFunction(0, 1, -2, 2); // f(x) = x + 1, [-2, 2]

        double result = sumFunctional.evaluate(linearFunction);// f(-2) = -2+1 = -1, f(2) = 2+1 = 3, f(0) = 0+1 = 1
        assertEquals(-1 + 3 + 1, result, 0.001);
    }

    @Test
    void testEvaluateZeroFunction() {
        SumFunctional sumFunctional = new SumFunctional();
        LinearFunction zeroFunction = new LinearFunction(0, 0, -5, 5); // f(x) = 0, [-5, 5]

        double result = sumFunctional.evaluate(zeroFunction);// f(-5) = 0, f(5) = 0, f(0) = 0
        assertEquals(0 + 0 + 0, result, 0.001);
    }
}