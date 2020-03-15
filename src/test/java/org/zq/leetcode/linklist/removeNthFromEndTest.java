package org.zq.leetcode.linklist;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class removeNthFromEndTest {

    @Test
    public void test() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(JSON.toJSON(new removeNthFromEnd().removeNthFromEnd(a, 2)));
    }

    @Test
    public void test2() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.println(JSON.toJSON(new removeNthFromEnd().removeNthFromEnd(a, 1)));
    }
}