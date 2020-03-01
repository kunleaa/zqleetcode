package org.zq.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class LevelOrderTest {

    @Test
    public void levelOrder() {
        /**
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         */
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);

        n3.left = n9;
        n3.right = n20;
        n20.left = n15;
        n20.right = n7;
        System.out.println(JSON.toJSON(new LevelOrder().levelOrder(n3)));
    }
}