package com.drelang.algorithms.p24_swapNodesInPairs;

/**
 *
 *  Given a linked list, swap every two adjacent nodes and return its head.
 *
 *  You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 *  Example:
 *
 *  Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Created by Drelang on 2019/05/21 21:56
 */

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.next == null) {    // 奇数个节点
                break;
            } else {
                ListNode tmp = cur.next.next;
                cur.next.next = tmp.next;
                tmp.next = cur.next;
                cur.next = tmp;
                cur = cur.next.next;
            }
        }
        return dummyHead.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}


