package org.zq.leetcode.linklist;


/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/41/
 */
public class deleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
