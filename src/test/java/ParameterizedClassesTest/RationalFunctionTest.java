package ParameterizedClassesTest;

import ParameterizedClasses.RationalFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RationalFunctionTest {

    @Test
    void testValidComputation() {
        RationalFunction rationalFunction = new RationalFunction(1, 2, 3, 4); // f(x) = (x + 2) / (3x + 4)

        assertEquals(0.5, rationalFunction.compute(0), 0.001); // f(0) = 2 / 4 = 0.5
        assertEquals(0.42857142857142855, rationalFunction.compute(1), 0.001); // f(1) = (1 + 2) / (3*1 + 4) = 3 / 7
    }

    @Test
    void testDivisionByZeroInitialization() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new RationalFunction(1, 2, 0, 0));
        assertEquals("Деление на 0 недопустимо", exception.getMessage());
    }

    @Test
    void testDivisionByZeroAtSpecificX() {
        RationalFunction rationalFunction = new RationalFunction(1, 2, 1, -2); // f(x) = (x + 2) / (x - 2)

        Exception exception = assertThrows(IllegalArgumentException.class, () -> rationalFunction.compute(2));
        assertEquals("Деление на 0 недопустимо при x = 2.0", exception.getMessage());
    }

    @Test
    void testEdgeCases() {
        RationalFunction rationalFunction = new RationalFunction(0, 1, 1, 0); // f(x) = 1 / x

        assertEquals(1, rationalFunction.compute(1), 0.001); // f(1) = 1 / 1
        assertEquals(-1, rationalFunction.compute(-1), 0.001); // f(-1) = 1 / -1
    }
}