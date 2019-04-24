package com.drelang.algorithms.p200_numberOfIslands;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/09 18:36
 */
public class TestSolution {
    @Test
    public void testSolutionA() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution solution = new SolutionA();
        Assert.assertEquals(1, solution.numIslands(grid));
    }
}
