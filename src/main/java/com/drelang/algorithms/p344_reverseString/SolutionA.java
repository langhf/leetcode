package com.drelang.algorithms.p344_reverseString;

/**
 * 用一个局部变量交换对应位置的元素
 * Created by Drelang on 2019/02/11 18:00
 */
public class SolutionA extends Solution {
    @Override
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n/2; i++) {
            // 交换位置
            swap(s, i, n-i-1);
        }
    }

    // 交换位于 i 和 j 位置的元素
    private void swap(char[] s, int i, int j) {
        char tmp;
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
