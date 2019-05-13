package com.drelang.algorithms.p17_letterCombinationsOfAPhoneNumber;


import java.util.*;

/**
 * Created by Drelang on 2019/05/13 19:04
 */

class Solution {
    private Map<String, List<String>> map = new HashMap<>();

    Solution() {
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));
    }


    List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if (digits == null || digits.length() < 1)
            return result;
        recursive(digits, 0, "", result);
        return result;
    }

    private void recursive(String digits, int index, String re, List<String> result) {
        if (index == digits.length()) {
            result.add(re);
            return;
        }
        List<String> cur = map.get(digits.substring(index, index+1));
        for (String str : cur) {
            recursive(digits, index+1, re+str, result);
        }
    }
}
