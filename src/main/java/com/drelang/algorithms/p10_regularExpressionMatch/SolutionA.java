package com.drelang.algorithms.p10_regularExpressionMatch;

/**
 * Created by Drelang on 2019/02/15 15:42
 */
public class SolutionA extends Solution {
    @Override
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return  s.isEmpty();
        boolean firstMatch = ( !s.isEmpty() &&
                                                ( p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') );
        if( p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        }
        else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
