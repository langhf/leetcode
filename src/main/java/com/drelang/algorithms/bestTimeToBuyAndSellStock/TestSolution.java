package com.drelang.algorithms.bestTimeToBuyAndSellStock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/02/14 22:41
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solutionA = new SolutionA();
        int[] prices = { 7,1,5,3,6,4 };
        int[] prices2 = { 2,1,2,1,0,1,2 };
        int expected = 5;
        int expected2 = 2;
        Assert.assertEquals(expected, solutionA.maxProfit(prices));
        Assert.assertEquals(expected2, solutionA.maxProfit(prices2));
        Solution solutionB = new SolutionB();
        Assert.assertEquals(expected, solutionB.maxProfit(prices));
        Assert.assertEquals(expected2, solutionB.maxProfit(prices2));
    }
}
