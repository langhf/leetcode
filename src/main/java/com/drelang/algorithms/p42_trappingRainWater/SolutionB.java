package com.drelang.algorithms.p42_trappingRainWater;

/**
 * 动态规划
 *
 * 用容器保存每个块的最高左块和最高右块
 *
 * Created by Drelang on 2019/02/12 18:26
 */
public class SolutionB extends Solution {
    @Override
    public int trap(int[] height) {
        int n = height.length;
        if(n<2) return 0;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        // 存储最高左块
        maxLeft[0] = height[0];
        for(int i=1; i<n; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        // 存储最高右块
        maxRight[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], height[i]);
        }
        // 计算总蓄水量
        int ans = 0;
        for(int i=1; i<n-1; i++) {
            ans += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return ans;
    }
}
