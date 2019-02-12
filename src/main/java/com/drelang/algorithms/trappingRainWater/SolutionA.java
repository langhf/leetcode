package com.drelang.algorithms.trappingRainWater;

/**
 * Brute Force
 * 去头去尾后，计算每个方块能存贮的水  ( 因为头和尾的方块存储不了水)
 * 对于每个方块，找到它最高的左边块和最高的右边块， 能够存储的水为 min( max_left, max_right ) - height[i]
 * 计算最高的左边块和最高的右边块时，应该把当前块的高度加入进行比较
 *
 * Created by Drelang on 2019/02/12 17:28
 */
public class SolutionA extends Solution {
    @Override
    public int trap(int[] height) {
        int n = height.length;
        int ans=0;
        for(int i=1; i<n-1; i++) {
            // 每一个i 的最大左柱和最大右柱
            int max_left = 0, max_right = 0;
            for(int j=i; j>=0; j--) {
                max_left = Math.max(max_left, height[j]);
            }
            for(int j=i; j<n; j++) {
                max_right  = Math.max(max_right, height[j]);
            }
            ans += Math.min(max_left, max_right) - height[i];
        }
        return ans;
    }
}
