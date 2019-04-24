package com.drelang.algorithms.p53_maximumSubarray;

import com.drelang.algorithms.SuperTestSolution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution extends SuperTestSolution {
    @Test
    public void testSolutionA() {
        SolutionA solution = new SolutionA();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(6, solution.maxSubArray(nums));
    }
}
