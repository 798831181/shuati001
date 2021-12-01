package com.sunqc.shuati.leetcode.pre;

import com.sunqc.shuati.leetcode.common.ListNode;

import java.util.logging.Logger;

/**
 * @author : [sun_qichao]
 * @version : [v1.0]
 * @className : ListNodeBuilder
 * @description : 准备链表测试数据
 * @createTime : [2021/12/2 12:30 上午]
 */
public class ListNodeBuilder {
    private static final Logger logger = Logger.getLogger("ListNodeBuilder");
    public static ListNode build(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        logger.info("测试数据初始化完成");
        return node1;
    }
}
