package com.drelang.algorithms.p23_mergeKSortedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Brute Force
 *
 * 1.遍历所有链表元素到一个 List 里面
 * 2. 排序然后逐个输出形成新链表
 * Created by Drelang on 2019/02/07 22:40
 */
public class SolutionA extends Solution {
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode curr = new ListNode(0);
        ListNode ans = curr;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<lists.length; i++) {
            while(lists[i] != null) {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            curr.next = new ListNode(0);
            curr.next.val = list.get(i);
            curr = curr.next;
        }
        return ans.next;
    }
}
