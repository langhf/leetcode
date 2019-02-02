package com.drelang.algorithms.validParentheses;

import java.util.Stack;

public class SolutionA extends Solution {
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            // stack 为空则直接添加该字符
            if(stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            // stack 不为空判断顶部字符是否与该字符互补
            if(isMatch(stack.peek(), ch)) {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatch(Character left, Character right) {
        switch (left) {
            case '(':
                return right == ')';
            case '[':
                return right == ']';
            case '{':
                return right == '}';
        }
        return false;
    }
}
