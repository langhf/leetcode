package com.drelang.algorithms.p5_longestPolindromicSubstring;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 *
 * Created by Drelang on 2019/05/20 21:32
 */

class Solution {
    private int start;
    private int maxLen;
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

