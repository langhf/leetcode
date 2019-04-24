package com.drelang.algorithms.p121_bestTimeToBuyAndSellStock;

/**
 * Brute Force
 * Created by Drelang on 2019/02/14 22:25
 */
public class SolutionA extends Solution {
    @Override
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<2) return 0;
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }
}
