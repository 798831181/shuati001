package com.sunqc.shuati.leetcode.common;

/**
 * @author : [sun_qichao]
 * @version : [v1.0]
 * @className : TestNode
 * @description : 链表节点公共类
 * @createTime : [2021/12/1 11:55 下午]
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
