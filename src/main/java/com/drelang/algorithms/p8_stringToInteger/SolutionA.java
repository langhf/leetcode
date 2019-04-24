package com.drelang.algorithms.p8_stringToInteger;

/**
 * Created by Drelang on 2019/02/27 21:15
 */
class SolutionA extends Solution {

    @Override
    int myAtoi(String str) {
        int n = str.length();
        int sum = 0;
        // 符号位
        int flag = 1;
        // 解决 -+2,  +-2 等情况
        int np = 0;
        for(int i=0; i<n; i++) {
            int d = charToDigit(str.charAt(i));
            // 检查字符是否合法
            if(d == -1) {
                if(sum != 0) {
                    return sum * flag;
                }
                else {
                    return 0;
                }
            }
            // 检查是否是空格
            if(d == -2) continue;
            // 检查是否有负号
            if(d == -3) {
                if(sum != 0) {
                    return 0;
                }
                else {
                    if(np !=0) {
                        return 0;
                    }
                    else {
                        flag = -1;
                        np++;
                        d = 0;
                    }
                }
            }
            // 检查是否有正号
            if(d == -4) {
                if(sum != 0) {
                    return 0;
                }
                else {
                    if(np!=0) {
                        return 0;
                    }
                    else {
                        np++;
                        flag = 1;
                        d = 0;
                    }
                }
            }
            // 检查是否溢出
            int of = isOverFlow(sum * flag, d);
            if(of != 0) {
                if(of == 1) return Integer.MAX_VALUE;
                if(of == -1) return Integer.MIN_VALUE;
            }
            sum = sum * 10 + d;
        }
        return sum * flag;
    }

    private int charToDigit(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case ' ': return -2;
            case '-': return -3;
            case '+': return -4;
            default:
                return -1;
        }
    }


    // 判断是否可能溢出，过大则返回1，过小则返回-1，否则返回0。
    private int isOverFlow(int sum, int pop) {
        if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && pop > 7)) return 1;
        if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && pop < -8)) return -1;
        return 0;
    }
}
