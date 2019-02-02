package com.drelang.algorithms.romanToInteger;

import com.drelang.algorithms.SuperTestSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution extends SuperTestSolution {

    @Test
    public void testSolutionA() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        SolutionA solution = (SolutionA) getSolution(this.getClass().getPackage().getName()+".SolutionA");
        assertEquals(3,solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void testSolutionB() {
    }
}
