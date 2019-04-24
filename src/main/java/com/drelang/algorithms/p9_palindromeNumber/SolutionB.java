package com.drelang.algorithms.p9_palindromeNumber;

/**
  *  Revert half of the number
 *
 *  1. 所有负数和以零结尾但是不为零的数都不是回文数
 *  2. 取数的后半部分反向组成新的数 revertedNumber， 难点在于如何判断到达中间位置
 *  3. 该回文数为偶数， 则 两部分相等； 该回文数为奇数， 则 revertedNumber / 10 后与前部分相等；
 *   12321  则 前部分为 12， 后部分为 123
  * Created by Drelang on 2019/02/02
  */
public class SolutionB {
    public boolean isPalindrome(int x) {
        if( x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
