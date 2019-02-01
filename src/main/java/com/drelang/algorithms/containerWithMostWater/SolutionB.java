package com.drelang.algorithms.containerWithMostWater;

/**
  *  Two pointer approach
  * Created by Drelang on 2019/02/01
  */
public class SolutionB {
    public int maxArea(int[] height) {
        int area = 0, i = 0, j = height.length - 1;
        while(i != j) {
            area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return area;
    }
}
