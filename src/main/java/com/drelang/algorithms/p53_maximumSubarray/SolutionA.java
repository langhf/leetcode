package com.drelang.algorithms.p53_maximumSubarray;

/**
  *  分治法
 *    设 i 为数组右边界，则
 *          maxSubArray(A, i) = maxSubArray(A, i-1) > 0 ? maxSubArray(A, i-1) : 0 + A[i]
 *     就是说以 i 为右边界时，此时最大子数组要看边界左边的子数组
  * Created by Drelang on 2019/02/02
  */
public class SolutionA extends Solution {
    @Override
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int ans = dp[0];
        for(int i=1; i<n; i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1]  : 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
