package ParameterizedClassesTest;

import ParameterizedClasses.SinFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinFunctionTest {

    @Test
    void testComputeWithinBounds() {
        SinFunction sinFunction = new SinFunction(2, Math.PI, 0, 1); // f(x) = 2sin(πx)

        assertEquals(0, sinFunction.compute(0), 0.001); // sin(0) = 0
        assertEquals(2, sinFunction.compute(0.5), 0.001); //  sin(π * 0.5) = 1, 2 * 1 = 2
        assertEquals(0, sinFunction.compute(1), 0.001); // sin(π * 1) = 0
    }

    @Test
    void testComputeOutOfBounds() {
        SinFunction sinFunction = new SinFunction(1, 1, 0, Math.PI); // f(x) = sin(x)

        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinFunction.compute(-1));
        assertEquals("x вне пределов", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> sinFunction.compute(Math.PI + 1));
        assertEquals("x вне пределов", exception.getMessage());
    }

    @Test
    void testGetBounds() {
        SinFunction sinFunction = new SinFunction(1, 2, -1, 1); // f(x) = sin(2x)

        assertEquals(-1, sinFunction.getLowerBound());
        assertEquals(1, sinFunction.getUpperBound());
    }

    @Test
    void testComputeEdgeCases() {
        SinFunction sinFunction = new SinFunction(3, Math.PI, 0, 2); // f(x) = 3sin(πx)

        assertEquals(0, sinFunction.compute(0), 0.001); // sin(π * 0) = 0
        assertEquals(0, sinFunction.compute(2), 0.001);  // sin(π * 2) = 0
        assertEquals(3, sinFunction.compute(0.5), 0.001); // sin(π * 0.5) = 1, 3 * 1 = 3
    }
}