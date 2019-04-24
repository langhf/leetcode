package com.drelang.algorithms.p42_trappingRainWater;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/12 18:02
 */
public class TestSolution {
    @Test
    public void testSolutionA() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        Solution solution = new SolutionA();
        Assert.assertEquals(expected, solution.trap(height));
        Solution solutionB = new SolutionB();
        Assert.assertEquals(expected, solutionB.trap(height));
        Solution solutionC = new SolutionC();
        Assert.assertEquals(expected, solutionC.trap(height));
    }
}
