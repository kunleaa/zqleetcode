package org.zq.leetcode.shu;


import org.zq.leetcode.TreeNode;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/
 */
public class sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return create(nums, 0, nums.length - 1);
    }

    private TreeNode create(int[] nums, int start, int end) {
        if (start > end || start >= nums.length || end >= nums.length) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode t = new TreeNode(nums[(start + end) / 2]);
        TreeNode l = create(nums, start, middle - 1);
        TreeNode r = create(nums, middle + 1, end);
        t.left = l;
        t.right = r;
        return t;
    }
}
