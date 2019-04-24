package com.drelang.algorithms.p23_mergeKSortedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Using Priority Queue
 * 用优先队列保存多个链表头元素，然后弹出最小元素
 * Created by Drelang on 2019/02/07 22:43
 */
public class SolutionB extends Solution {
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val < o2.val) {
                    return -1;
                }
                else if(o1.val == o2.val) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(ListNode node : lists) {
            if(node != null) {
                queue.add(node);
            }
        }

        while(!queue.isEmpty()) {
            curr.next = queue.poll();
            curr = curr.next;
            if(curr.next != null) {
                queue.add(curr.next);
            }
        }
        return dummy.next;
    }
}
