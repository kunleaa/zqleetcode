package org.zq.leetcode;


/**
 * https://leetcode-cn.com/problems/check-subtree-lcci/submissions/
 */
public class check_subtree_lcci {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 != null && t2 != null) {
            if (t1.val == t2.val) {
                return checkSubTree(t1.left, t2.left) && checkSubTree(t1.right, t2.right);
            } else {
                return checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
            }
        }
        return false;
    }
}
