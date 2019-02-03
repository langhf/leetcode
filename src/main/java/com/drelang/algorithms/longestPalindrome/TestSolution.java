package com.drelang.algorithms.longestPalindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/03 12:10
 */
public class TestSolution {
    @Test
    public void testSolutionA() {
        SolutionA solution = new SolutionA();
        Assert.assertEquals("aba", solution.longestPalindrome("babad"));
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
        Assert.assertEquals("", solution.longestPalindrome(""));
    }

    @Test
    public void testSolutionB() {
        SolutionB solution = new SolutionB();
        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
        Assert.assertEquals("", solution.longestPalindrome(""));
    }
}
