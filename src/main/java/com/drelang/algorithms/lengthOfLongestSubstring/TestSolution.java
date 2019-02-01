package com.drelang.algorithms.lengthOfLongestSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSolution {
    String s = "dvdf";
    @Test
    public void testSolutionA() {
        SolutionA solutionA = new SolutionA();
        int ans1 = solutionA.lengthOfLongestSubstring(s);
        assertEquals(3, ans1);
    }

    @Test
    public void testSolutionB() {
        SolutionB solutionB = new SolutionB();
        int ans = solutionB.lengthOfLongestSubstring(s);
        assertEquals(3, ans);
    }

    @Test
    public void testSolutionC() {
        SolutionC solutionC = new SolutionC();
        int ans = solutionC.lengthOfLongestSubstring(s);
        assertEquals(3, ans);
    }
}
