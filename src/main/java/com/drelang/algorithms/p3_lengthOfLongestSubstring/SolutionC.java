package com.drelang.algorithms.p3_lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
  *  Sliding Window Optimized
 *   利用Map直接找重复元素的下标
  * Created by Drelang on 2019/02/01
  */
public class SolutionC {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0, j=0; j<s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                // 将 i 移动到最后一个重复元素处
                i = Math.max(i, map.get(s.charAt(j)));
            }
            // 放进去的下标比实际的下标多1
            map.put(s.charAt(j), j+1);
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}
