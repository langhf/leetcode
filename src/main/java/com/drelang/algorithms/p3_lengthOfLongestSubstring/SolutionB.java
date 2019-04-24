package com.drelang.algorithms.p3_lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
  *  Sliding Window
 *  A sliding window is an abstract concept commonly used in array/string problems.
 *  j 先走， i 后走
  * Created by Drelang on 2019/02/01
  */
public class SolutionB {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i=0, j=0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(i<n && j<n) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
