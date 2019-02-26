package com.drelang.algorithms.regularExpressionMatch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/15 15:47
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new SolutionA();
        Assert.assertFalse(solution.isMatch("aa", "a"));
        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("ab", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));
        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }
}
