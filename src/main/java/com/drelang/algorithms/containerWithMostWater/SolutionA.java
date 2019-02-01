package com.drelang.algorithms.containerWithMostWater;

/**
  *  Brute Force
  * Created by Drelang on 2019/02/01
  */
public class SolutionA {
    public int maxArea(int[] height) {
        int ans = 0;
        int n = height.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                ans = Math.max(area, ans);
            }
        }
        return ans;
    }
}
