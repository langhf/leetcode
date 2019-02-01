package com.drelang.algorithms.containerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution {
    int[] height = { 1,8,6,2,5,4,8,3,7 };
    final int EXPECTED = 49;

    @Test
    public void testSolutionA() {
        SolutionA solutionA = new SolutionA();
        int ans = solutionA.maxArea(height);
        assertEquals(EXPECTED, ans);
    }

    @Test
    public void testSolutionB() {
        SolutionB solutionB = new SolutionB();
        int ans = solutionB.maxArea(height);
        assertEquals(EXPECTED, ans);
    }
}
