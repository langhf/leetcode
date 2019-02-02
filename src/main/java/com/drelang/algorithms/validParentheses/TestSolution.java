package com.drelang.algorithms.validParentheses;

import com.drelang.algorithms.SuperTestSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution extends SuperTestSolution {
    @Test
    public void testSolutionA() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        SolutionA solution = (SolutionA) getSolution(this.getClass().getPackage().getName() + ".SolutionA");
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
    }
}
