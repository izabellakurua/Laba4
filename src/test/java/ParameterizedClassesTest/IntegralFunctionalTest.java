package ParameterizedClassesTest;

import ParameterizedClasses.IntegralFunctional;
import ParameterizedClasses.LinearFunction;
import ParameterizedClasses.SinFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegralFunctionalTest {

    @Test
    void testEvaluateLinearFunction() {
        IntegralFunctional integralFunctional = new IntegralFunctional(1000);
        LinearFunction linearFunction = new LinearFunction(2, 0, 0, 10); // f(x) = 2x, [0, 10]

        double result = integralFunctional.evaluate(linearFunction);// Интеграл от 0 до 10: ∫(2x)dx = x^2, [0^2, 10^2] = 100
        assertEquals(100, result, 0.001);
    }

    @Test
    void testEvaluateConstantFunction() {
        IntegralFunctional integralFunctional = new IntegralFunctional(1000);
        LinearFunction constantFunction = new LinearFunction(0, 5, 0, 10); // f(x) = 5, [0, 10]

        double result = integralFunctional.evaluate(constantFunction);// Интеграл от 0 до 10: ∫(5)dx = 5x, [0, 10] = 50
        assertEquals(50, result, 0.001);
    }

    @Test
    void testEvaluateSinFunction() {
        IntegralFunctional integralFunctional = new IntegralFunctional(1000);
        SinFunction sinFunction = new SinFunction(1, Math.PI, 0, 1); // f(x) = sin(πx), [0, 1]

        double result = integralFunctional.evaluate(sinFunction);// Интеграл от 0 до 1: ∫(sin(πx))dx = -cos(πx)/π , [cos(0), cos(π)] = 2/π
        assertEquals(2 / Math.PI, result, 0.001);
    }

    @Test
    void testEvaluateZeroFunction() {
        IntegralFunctional integralFunctional = new IntegralFunctional(1000);
        LinearFunction zeroFunction = new LinearFunction(0, 0, 0, 10); // f(x) = 0, [0, 10]

        double result = integralFunctional.evaluate(zeroFunction);// Интеграл от 0 до 10: ∫(0)dx = 0
        assertEquals(0, result, 0.001);
    }
}