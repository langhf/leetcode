package com.drelang.algorithms.p409_longestPalindrome;

/**
 * Brute Force
 *
 * Created by Drelang on 2019/02/03 12:00
 */
public class SolutionA extends Solution {
    @Override
    String longestPalindrome(String s) {
        if(s.equals("")) {
            return "";
        }

        int[] index = {0, 0};
        int n = s.length();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(isPalindrome(s.substring(i, j+1))) {
                    if((j - i + 1) > (index[1] - index[0])) {
                        index[0] = i;
                        index[1] = j;
                    }
                }
            }
        }
        return s.substring(index[0], index[1]+1);
    }

    // 判断字符串是否是回文
    private boolean isPalindrome(String s) {
        int n = s.length();
        for(int i=0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
