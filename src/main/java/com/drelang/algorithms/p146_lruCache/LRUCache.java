package com.drelang.algorithms.p146_lruCache;

import java.util.*;

/**
  *  Least Recently Used (LRU) cache
 *   双链表法，带头和尾的双链表， 表头和表尾只作查找节点用
 *
 *   1. 新加入的节点添加到表头后面
 *   2. 容量满了后删除表尾前面的节点
 *   3. 最后被命中的节点位置提前到头部后面
 *
  * Created by Drelang on 2019/02/02
  */
public class LRUCache {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;
    }

    private int capacity;
    private int counts;
    private Map<Integer, DLinkedNode> map = new HashMap<>();
    private DLinkedNode head = new DLinkedNode();
    private DLinkedNode tail = new DLinkedNode();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        counts = 0;

        // 初始化双链表
        head.pre = null;
        head.next = tail;
        tail.next = null;
        tail.pre = head;
    }

    // 增加节点
    private void addNode(DLinkedNode node) {
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;
    }

    // 移除节点
    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    // 将节点移到头部之后
    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    // 弹出最后一个节点
    private DLinkedNode popTail() {
        DLinkedNode node = tail.pre;
        removeNode(node);
        return node;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        DLinkedNode node = map.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if(node == null) {
            // 添加新节点且往 map 里添加新元素
             node = new DLinkedNode();
            node.key = key;
            node.value = value;
            addNode(node);
            map.put(key, node);
            ++counts;

            // 达到容量则删除节点和 map 中元素
            if(counts > capacity) {
                DLinkedNode delNode =  popTail();
                map.remove(delNode.key);
                --counts;
            }
        }
        else {
            // 不管该节点的 value 与要存的 value 是否相同， 更新该节点的 value 就行， 然后移到头部之后
            node.value = value;
            moveToHead(node);
        }

    }
}
