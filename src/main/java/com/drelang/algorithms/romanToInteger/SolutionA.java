package com.drelang.algorithms.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class SolutionA extends Solution {
    private Map<Character, Integer> map = new HashMap<>();

    public SolutionA() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0; i<n-1; i++) {
            int left = map.get(s.charAt(i));
            int right = map.get(s.charAt(i+1));
            if(left < right) {
                left = -left;
            }
            sum += left;
        }
        sum += map.get(s.charAt(n-1));
        return sum;
    }
}
