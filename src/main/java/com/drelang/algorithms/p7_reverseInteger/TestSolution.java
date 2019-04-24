package com.drelang.algorithms.p7_reverseInteger;

import com.drelang.algorithms.SuperTestSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution extends SuperTestSolution {
    @Test
    public void testSolutionA() {
        SolutionA solution = new SolutionA();
        Assert.assertEquals(123, solution.reverse(321));
        Assert.assertEquals(-321, solution.reverse(-123));
        Assert.assertEquals(21, solution.reverse(120));
    }

    @Test
    public void testSolutionB() {
        SolutionB solution = new SolutionB();
        Assert.assertEquals(123, solution.reverse(321));
        Assert.assertEquals(-321, solution.reverse(-123));
        Assert.assertEquals(21, solution.reverse(120));
    }
}
