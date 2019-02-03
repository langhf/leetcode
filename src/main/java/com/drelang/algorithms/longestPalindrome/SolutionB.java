package com.drelang.algorithms.longestPalindrome;

/**
 * 动态编程， 贪婪法
 * Created by Drelang on 2019/02/03 14:12
 */
public class SolutionB extends Solution {
    private int start;
    private int maxLen;
    @Override
    String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2) return s;
        maxLen = 0;
        start = 0;
        for(int i=0; i<n-1; i++) {
            extendPalindrome(s, i, i); // 假设 s 是奇数长度
            extendPalindrome(s, i, i+1); // 假设 s 是偶数长度
        }
        return s.substring(start, start+maxLen);
    }

    private void extendPalindrome(String s, int i, int j) {
        while(i >=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        // 此时的 i 和 j 刚好不是在最长回文的地方，即最长回文下标为 i + 1 和 j - 1， 长度为 (j - 1) - (i + 1) + 1
        if(maxLen < j - i - 1) {
            maxLen = j - i -1;
            start = i + 1;
        }
    }
}
