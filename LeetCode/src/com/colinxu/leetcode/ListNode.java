package com.colinxu.leetcode;

/**
 * @author: colinxu
 * @date: 2021/8/1 17:54
 * @description: 链表
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder().append(val);
        if (next != null) {
            sb.append("->").append(next);
        }
        return sb.toString();
    }
}
