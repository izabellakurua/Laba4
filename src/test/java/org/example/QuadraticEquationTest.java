package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testTwoRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, -3, 2);
        double[] roots = eq.solve();
        Assertions.assertArrayEquals(new double[]{2, 1}, roots);
    }

    @Test
    void testOneRoot() {
        QuadraticEquation eq = new QuadraticEquation(1, -2, 1);
        double[] roots = eq.solve();
        Assertions.assertArrayEquals(new double[]{1}, roots);
    }

    @Test
    void testNoRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, 0, 1);
        double[] roots = eq.solve();
        assertEquals(0, roots.length);
    }
}