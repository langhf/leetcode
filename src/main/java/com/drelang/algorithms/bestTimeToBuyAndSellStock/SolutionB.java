package com.drelang.algorithms.bestTimeToBuyAndSellStock;

/**
 * One Pass
 * Created by Drelang on 2019/02/15 17:12
 */
public class SolutionB extends Solution {
    @Override
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
