package com.drelang.algorithms.p141_linkedListCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * 用 HashTable
 * Created by Drelang on 2019/02/14 21:57
 */
public class SolutionA extends Solution {
    @Override
    boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null) {
            if(set.contains(head)) {
                return true;
            }
            else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
