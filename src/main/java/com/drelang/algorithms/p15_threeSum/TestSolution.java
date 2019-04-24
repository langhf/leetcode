package com.drelang.algorithms.p15_threeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Drelang on 2019/02/11 19:59
 */
public class TestSolution {
    @Test
    public void testSolutionA() {
        int[] nums = { -1, 0, 1, 2, -1, -4};
        List<Integer> list1 = new LinkedList<>(Arrays.asList(-1, -1, 2));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(-1, 0, 1));
        List<List<Integer>> expected = new LinkedList<>(Arrays.asList(list1, list2));
        Solution solution = new SolutionA();
        Assert.assertThat(solution.threeSum(nums), is(expected));
    }
}
