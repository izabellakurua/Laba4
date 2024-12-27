package ParameterizedClassesTest;

import ParameterizedClasses.LinearFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearFunctionTest {

    @Test
    void testComputeWithinBounds() {
        LinearFunction function = new LinearFunction(2, 3, 0, 10); // f(x) = 2x + 3
        assertEquals(13, function.compute(5), 0.01); // f(5) = 2*5 + 3 = 13
        assertEquals(3, function.compute(0), 0.01);  // f(0) = 2*0 + 3 = 3
    }

    @Test
    void testComputeOutOfBounds() {
        LinearFunction function = new LinearFunction(1, 1, 0, 5); // f(x) = x + 1
        Exception exception = assertThrows(IllegalArgumentException.class, () -> function.compute(-1));
        assertEquals("x вне пределов отрезка.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> function.compute(6));
        assertEquals("x вне пределов отрезка.", exception.getMessage());
    }

}