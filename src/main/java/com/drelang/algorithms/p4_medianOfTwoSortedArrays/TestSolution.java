package com.drelang.algorithms.p4_medianOfTwoSortedArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSolution {
    int[] nums1 = { 1, 2 };
    int[] nums2 = { 3, 4 };
    double median = 2.5;

    @Test
    public void testSolutionA() {
        SolutionA solutionA = new SolutionA();
        double ans = solutionA.findMedianSortedArrays(nums1, nums2);
        assertEquals(median, ans, 0.0);
    }
}
