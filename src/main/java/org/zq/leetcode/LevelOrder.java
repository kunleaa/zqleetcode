package org.zq.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedBlockingDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        q.add(root);

        while (true) {
            Queue<TreeNode> temp = new LinkedBlockingDeque<>();
            List<Integer> level = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode c = q.poll();
                level.add(c.val);
                if (null != c.left)
                    temp.add(c.left);
                if (null != c.right)
                    temp.add(c.right);
            }
            result.add(level);
            q.addAll(temp);
            if (temp.size() == 0) {
                break;
            }
        }
        return result;
    }
}
