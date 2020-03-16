package org.zq.leetcode.shu;

import org.junit.Assert;
import org.junit.Test;
import org.zq.leetcode.TreeNode;


public class isSymmetricTest {

    @Test
    public void test1() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(3);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        Assert.assertEquals(true, new isSymmetric().isSymmetric(a));
    }

    @Test
    public void test2() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(3);
        a.left = b;
        a.right = c;
        b.right = d;
        c.right = e;
        Assert.assertEquals(false, new isSymmetric().isSymmetric(a));
    }
}