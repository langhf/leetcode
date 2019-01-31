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
        ListNode dummyHead = new ListNode(0);
        ListNode curr=dummyHead, p=l1, q=l2;
        int carry = 0;
        while( p != null ||  q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            // 此处注意不能判断 p.next , 因为 p 为 null 的话会引发空指针错误
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}