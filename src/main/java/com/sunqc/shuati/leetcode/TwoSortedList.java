package com.sunqc.shuati.leetcode;

/**
 * 两个有序队列合并
 */
public class TwoSortedList {

    class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode solve(ListNode l1, ListNode l2){
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }
        if (l1.val < l2.val){
             l1.next = solve(l1.next, l2);
             return l1;
        }else {
            l2.next = solve(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {


    }
}
