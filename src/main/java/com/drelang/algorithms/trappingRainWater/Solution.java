package com.drelang.algorithms.trappingRainWater;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 *      compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 * Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 *
 * Created by Drelang on 2019/02/12 17:28
 */
public abstract class Solution {
    public abstract int trap(int[] height);
}
