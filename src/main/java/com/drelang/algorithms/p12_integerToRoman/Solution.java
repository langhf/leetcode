package com.drelang.algorithms.p12_integerToRoman;

/**
 * Created by Drelang on 2019/04/24 21:23
 */
class Solution {
    public String intToRoman(int num) {
        //String[] M = {"", "M", "MM"};
        String[] D = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] L  = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I   = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int right = num % 1000; //千位以下
        int left = num / 1000; //千位以上
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<left; i++)
            sb.append("M");

        sb.append(D[right/100]); // 转换百位
        sb.append(L[right%100/10]); // 转换十位
        sb.append(I[right%10/1]); // 转换个位

        return sb.toString();

    }
}
