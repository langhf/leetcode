package com.drelang.algorithms.p344_reverseString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/11 18:09
 */
public class TestSolution {
    @Test
    public void testSolutionA() {
        char[] s = { 'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        Solution solution = new SolutionA();
        solution.reverseString(s);
        Assert.assertArrayEquals(expected, s);
    }
}
