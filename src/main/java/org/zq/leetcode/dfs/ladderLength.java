package org.zq.leetcode.dfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<String> notvisited = new ArrayList<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;

        while (true) {
            // 用于保存下一层所有节点
            Queue<String> temp = new LinkedList<>();
            // 当前层遍历结束
            while (!q.isEmpty()) {
                String v = q.poll();
                List<String> rnv = new ArrayList<>();
                for (String nv : notvisited) {
                    if (canchange(nv, v)) {
                        if (nv.equals(endWord)) {
                            return level + 1;
                        }
                        temp.add(nv);
                        rnv.add(nv);
                    }
                }
                notvisited.removeAll(rnv);
            }
            // 结束条件
            if (temp.isEmpty()) {
                break;
            }
            q.addAll(temp);
            level++;
        }
        return 0;
    }

    boolean canchange(String from, String to) {
        int dffCnt = 0;
        for (int j = 0; j < from.length() && dffCnt <= 1; j++) {
            if (from.charAt(j) != to.charAt(j)) {
                dffCnt++;
            }
        }
        return dffCnt == 1;
    }

}
