package org.zq.leetcode.shu;


import org.zq.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> i = new ArrayList<>();
        List<Integer> j = new ArrayList<>();
        genzuoyou(root.left, i);
        genyouzuo(root.right, j);

        if (i.size() != j.size()) {
            return false;
        }

        for (int index = 0; index < i.size(); index++) {
            if (!i.get(index).equals(j.get(index))) {
                return false;
            }
        }
        return true;
    }

    private void genzuoyou(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(Integer.MIN_VALUE);
            return;
        }
        list.add(root.val);
        genzuoyou(root.left, list);
        genzuoyou(root.right, list);
    }

    private void genyouzuo(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(Integer.MIN_VALUE);
            return;
        }
        list.add(root.val);
        genyouzuo(root.right, list);
        genyouzuo(root.left, list);
    }

}
