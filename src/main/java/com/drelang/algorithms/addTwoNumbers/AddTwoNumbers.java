package com.drelang.algorithms.addTwoNumbers;

/**
  * You are given two non-empty linked lists representing two non-negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 *
 *  You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *  Example:
 *
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 *  Explanation: 342 + 465 = 807.
 *
  * Created by Drelang on 2019/01/31
  */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode re = result;
        int c = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null){
                result = l2;
                break;
            }
            if (l2 == null) {
                result = l1;
                break;
            }
            int sum = l1.val + l2.val + c;
            result.val = sum % 10;
            c = sum/10;
            result.next = new ListNode(5);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(c == 1) {
            result.val = c;
        }
        return re;
    }
}