package com.drelang.algorithms.p141_linkedListCycle;

/**
 * 双指针
 * 一个慢指针，一个快指针
 * 推荐此方法！
 * Created by Drelang on 2019/02/14 22:00
 */
public class SolutionB extends Solution {
    @Override
    boolean hasCycle(ListNode head) {
        if( head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            // 非闭环情况下，快指针会更快到达尾部，因此不需要判断慢指针
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
