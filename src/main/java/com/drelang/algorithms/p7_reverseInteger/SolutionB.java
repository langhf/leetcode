package com.drelang.algorithms.p7_reverseInteger;

/**
  *  1. 判断 rev = rev * 10 + pop 是否溢出，判断右边的 rev 即可
 *          当 rev 为正数时
 *              若 rev 大于 MAX_VALUE / 10 ，那么一定溢出
 *              或者， rev == MAX_VALUE / 10 而且 pop > 7 ，那么一定溢出
 *          当 rev 为负数时
 *              若 rev 小于 MIN_VALUE / 10， 那么一定溢出
 *              或者，rev == MIN_VALUE / 10 而且 pop < -8 ，那么一定溢出
  * Created by Drelang on 2019/02/02
  */
public class SolutionB extends Solution {
    @Override
    public int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            if( rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if( rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            x /= 10;
        }
        return rev;
    }
}
