package com.drelang.algorithms.p9_palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSolution {
    @Test
    public void testSolutionA() {
        SolutionA solutionA = new SolutionA();
        assertTrue(solutionA.isPalindrome(121));
        assertFalse(solutionA.isPalindrome(-121));
        assertFalse(solutionA.isPalindrome(10));
    }

    @Test
    public void testSolutionB() {
        SolutionB solutionB = new SolutionB();
        assertTrue(solutionB.isPalindrome(121));
        assertFalse(solutionB.isPalindrome(-121));
        assertFalse(solutionB.isPalindrome(10));
    }
}
