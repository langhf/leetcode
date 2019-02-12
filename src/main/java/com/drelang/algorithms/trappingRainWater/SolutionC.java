package com.drelang.algorithms.trappingRainWater;

/**
 * 双指针法改善动态规划
 *
 * 左边比右边低时，判断当前块高度与左边最高块高度大小；
 * 右边比左边低时，判断当前块高度与右边最高快高度大小。
 *
 * Created by Drelang on 2019/02/12 20:06
 */
public class SolutionC extends Solution {
    @Override
    public int trap(int[] height) {
        int ans = 0;
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = height.length-1;
        while (left < right) {
            if(height[left] < height[right]) {
                // 左指针比右指针指向的块高度低
                if(height[left] > maxLeft) {
                    maxLeft = height[left];
                }
                else {
                    ans += maxLeft - height[left];
                }
                left++;
            }
            else {
                // 右指针比左指针指向的块高度低
                if(height[right] > maxRight) {
                    maxRight = height[right];
                }
                else {
                    ans += maxRight - height[right];
                }
                right--;
            }

        }
        return ans;
    }
}
