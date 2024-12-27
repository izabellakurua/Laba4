package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquationHandlerTest {

    @Test
    void testLargerRoot() {
        EquationHandler handler = new EquationHandler(new QuadraticEquation(1, -3, 2));
        assertEquals(2, handler.getLargerRoot());
    }

    @Test
    void testOneRoot() {
        EquationHandler handler = new EquationHandler(new QuadraticEquation(1, -2, 1));
        assertEquals(1, handler.getLargerRoot());
    }

    @Test
    void testNoRoots() {
        EquationHandler handler = new EquationHandler(new QuadraticEquation(1, 0, 1));
        assertThrows(IllegalStateException.class, handler::getLargerRoot);
    }
}