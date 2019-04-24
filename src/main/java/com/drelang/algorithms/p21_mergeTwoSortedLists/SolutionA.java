package com.drelang.algorithms.p21_mergeTwoSortedLists;

/**
 * 遍历两个链表，逐位比较
 * Created by Drelang on 2019/02/12 14:28
 */
public class SolutionA extends Solution {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode dummyHead = curr;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                curr.next = l2;
                break;
            }
            if(l2 == null) {
                curr.next = l1;
                break;
            }
            // 比较 l1.val 和 l2.val 的大小
            if(l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}
