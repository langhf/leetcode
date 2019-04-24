package com.drelang.algorithms.p8_stringToInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/27 21:36
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solutionA = new SolutionA();
        Assert.assertEquals(42, solutionA.myAtoi("42"));
        Assert.assertEquals(-42, solutionA.myAtoi("   -42"));
        Assert.assertEquals(4193, solutionA.myAtoi("4193 with words"));
        Assert.assertEquals(0, solutionA.myAtoi("words and 987"));
        Assert.assertEquals(Integer.MIN_VALUE, solutionA.myAtoi("-91283472332"));
        Assert.assertEquals(1, solutionA.myAtoi("+1"));
        Assert.assertEquals(0, solutionA.myAtoi("+-1"));
        Assert.assertEquals(-12, solutionA.myAtoi("  -0012a42"));
    }
}
