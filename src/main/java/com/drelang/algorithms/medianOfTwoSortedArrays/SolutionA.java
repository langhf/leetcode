package com.drelang.algorithms.medianOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

/**
  *  时间复杂度为 O(m+n)
  * Created by Drelang on 2019/02/01
  */
public class SolutionA {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0d;
        List<Integer> list = getTotalArray(nums1, nums2);
        int n = list.size();
        if(n%2 == 1) {
            ans = list.get(n/2);
        }
        else {
            int left = list.get(n/2 - 1);
            int right = list.get(n/2);
            ans = (left + right) / 2.0;
        }
        return ans;
    }

    // 将两个数组按顺序组合成一个 list
    public List<Integer> getTotalArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length || j<nums2.length) {
            if(i >= nums1.length) {
                list.add(nums2[j++]);
            }
            else if(j >= nums2.length) {
                list.add(nums1[i++]);
            }
            else {
                int tmp = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
                list.add(tmp);
            }
        }
        return list;
    }
}
