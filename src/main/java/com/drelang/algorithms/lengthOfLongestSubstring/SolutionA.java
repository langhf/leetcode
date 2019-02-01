package com.drelang.algorithms.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
  *  Brute Force
  * Created by Drelang on 2019/01/31
  */
public class SolutionA {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i=0; i<s.length(); i++)
            for(int j=i+1; j<=s.length(); j++) {
                if(allUnique(s, i, j)) result = Math.max(result, j-i);
            }
        return result;
    }

    // 包括开始位但不包括最后一位, 即 [start, end)
    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for(int i=start; i<end; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

}
