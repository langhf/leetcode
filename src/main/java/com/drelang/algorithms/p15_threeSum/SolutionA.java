package com.drelang.algorithms.p15_threeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. 先将数组从大到小排序
 * 2. 将 3sum 问题转化为 2sum问题
 *     2.1 初始化一个 List 用来存放返回结果， 初始化变量 n 用来存放数组长度
 *     2.2 i 从 0  到 n - 2来做 2.3 的运算
 *     2.3 从两头至中间寻找可能的两个数满足 3sum 的条件
 *
 * Created by Drelang on 2019/02/11 19:26
 */
public class SolutionA extends Solution {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int n = nums.length;
        for(int i=0; i<n-2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                // 转化为 2sum 问题
                int sum = 0 - nums[i];
                int low = i + 1, high = n - 1;
                while (low < high) {
                    if(nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // 跳过重复元素
                        do {
                            low++;
                        } while (low < high && nums[low] == nums[low-1]);

                        do {
                            high--;
                        } while (low < high && nums[high] == nums[high+1]);
                    }
                    else if(nums[low] + nums[high] < sum) {
                        // 左边向右移，并且跳过重复元素
                        do {
                            low++;
                        } while (low < high && nums[low] == nums[low-1]);
                    }
                    else {
                        do {
                            high--;
                        } while (low < high && nums[high] == nums[high+1]);
                    }
                }
            }
        }
        return result;
    }
}