package ParameterizedClassesTest;

import ParameterizedClasses.ExponentialFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExponentialFunctionTest {

    @Test
    void testCompute() {
        ExponentialFunction expFunction = new ExponentialFunction(2, 3); // f(x) = 2 * exp(x) + 3

        // Проверяем значение функции при нескольких x
        assertEquals(2 * Math.exp(0) + 3, expFunction.compute(0), 0.001); // f(0) = 2 * e^0 + 3 = 5
        assertEquals(2 * Math.exp(1) + 3, expFunction.compute(1), 0.001); // f(1) = 2 * e^1 + 3
        assertEquals(2 * Math.exp(-1) + 3, expFunction.compute(-1), 0.001); // f(-1) = 2 * e^(-1) + 3
    }

    @Test
    void testNegativeAValue() {
        ExponentialFunction expFunction = new ExponentialFunction(-1, 0); // f(x) = -exp(x)

        assertEquals(-Math.exp(0), expFunction.compute(0), 0.001); // f(0) = -e^0 = -1
        assertEquals(-Math.exp(1), expFunction.compute(1), 0.001); // f(1) = -e^1
        assertEquals(-Math.exp(-1), expFunction.compute(-1), 0.001); // f(-1) = -e^(-1)
    }

    @Test
    void testZeroAValue() {
        ExponentialFunction expFunction = new ExponentialFunction(0, 5); // f(x) = 5

        assertEquals(5, expFunction.compute(0), 0.001); // f(0) = 5
        assertEquals(5, expFunction.compute(1), 0.001); // f(1) = 5
        assertEquals(5, expFunction.compute(-1), 0.001); // f(-1) = 5
    }
}