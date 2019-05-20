package com.drelang.algorithms.p22_generateParentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * Created by Drelang on 2019/05/20 21:09
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        backTrack(list, "", 0, 0, n);
        return list;
    }

    private void backTrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backTrack(list, str+"(", open+1, close, max);
        if (close < open)
            backTrack(list, str+")", open, close+1, max);
    }
}

