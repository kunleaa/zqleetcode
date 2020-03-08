package org.zq.leetcode;


/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/
 */
public class rotate {
    public void rotate(int[][] matrix) {
        int length = matrix[0].length;
        // 先斜线交换
        for (int index1 = 0; index1 < length; index1++) {
            for (int index2 = index1; index2 < length; index2++) {
                int temp = matrix[index1][index2];
                matrix[index1][index2] = matrix[index2][index1];
                matrix[index2][index1] = temp;
            }
        }

        // 再按中线对调
        for (int index1 = 0; index1 < length; index1++) {
            for (int index2 = 0; index2 < length / 2; index2++) {
                int temp = matrix[index1][index2];
                matrix[index1][index2] = matrix[index1][length - 1 - index2];
                matrix[index1][length - 1 - index2] = temp;
            }
        }
    }
}
