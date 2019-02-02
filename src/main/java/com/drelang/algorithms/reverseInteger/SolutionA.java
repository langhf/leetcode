package com.drelang.algorithms.reverseInteger;

/**
 *  MIN_VALUE = -2^31
 *  MAX_VALUE = 2^31 -1
 *
  *  1. x 为最小值时， 翻转后一定溢出
 *   2. 用一个标志位存放正负符号， 并且将负的 x 变为正的
 *   3. 用一个 long 类型的数存放 rev ，判断 rev 是否超过了 MAX_VALUE
 *
  * Created by Drelang on 2019/02/02
  */
public class SolutionA extends Solution {
    @Override
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE)
            return 0;

        long reverseNumber = 0l;
        int flag = 1;
        if(x < 0) {
            x = -x;
            flag = -1;
        }

        while(x > 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            if(reverseNumber > Integer.MAX_VALUE)
                return 0;
            x /= 10;
        }
        return (int)reverseNumber * flag;
    }
}
