package com.drelang.algorithms.mergeTwoSortedLists;

/**
 * 递归法
 *
 * Created by Drelang on 2019/02/12 15:45
 */
public class SolutionB extends Solution {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}
