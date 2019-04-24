package com.drelang.algorithms.p20_validParentheses;

import java.util.Stack;

/**
  *  1. 初始化一个 Stack ，用来存放 Character
 *   2. 自头至尾遍历字符串取字符，
 *      若 Stack 为空，直接添加该字符；
 *      若 Stack 不为空，判断 Stack 顶部字符是否与该字符互补
 *              若互补，则弹出顶部字符
 *              若不互补，则加入该字符至 Stack 中
 *   3. Stack 为空则是有效的括弧， 否则不是有效的括弧。
 *
  * Created by Drelang on 2019/02/02
  */
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
