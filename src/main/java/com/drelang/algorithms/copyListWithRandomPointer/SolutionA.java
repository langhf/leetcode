package com.drelang.algorithms.copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * 用 Map
 * Created by Drelang on 2019/02/14 20:42
 */
public class SolutionA extends Solution {
    @Override
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode node = head;
        while(node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }
        node = head;
        while(node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
