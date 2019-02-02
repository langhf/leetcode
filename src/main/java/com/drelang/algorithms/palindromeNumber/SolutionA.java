package com.drelang.algorithms.palindromeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionA {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }

        List<Integer> list = new ArrayList<>();
        while(x != 0) {
            list.add(x % 10);
            x /= 10;
        }
        int n = list.size();
        for(int i=0; i<n/2; i++) {
            if(! list.get(i).equals(list.get(n-i-1))) {
                return false;
            }
        }
        return true;
    }
}
