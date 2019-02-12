package com.drelang.algorithms.mergeTwoSortedLists;

import org.junit.Test;

/**
 * Created by Drelang on 2019/02/12 14:32
 */
public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new SolutionA();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode res = solution.mergeTwoLists(l1, l2);
        System.out.println(res);

        Solution solution1 = new SolutionB();
        ListNode res2 = solution1.mergeTwoLists(l1, l2);
    }
}
