package org.zq.leetcode.dfs;


import java.util.*;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        List<String> copyWordList = new ArrayList<>(wordList);
        copyWordList.add(beginWord);

        long[][] lin = new long[copyWordList.size()][copyWordList.size()];
        for (int i = 0; i < copyWordList.size(); i++) {
            for (int j = 0; j < copyWordList.size(); j++) {
                if (canchange(copyWordList.get(i), copyWordList.get(j))) {
                    lin[i][j] = 1;
                } else {
                    lin[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // 代表源到其他节点的最短距离 0 表示 不能到达
        long[] c = new long[copyWordList.size()];
        for (int i = 0; i < c.length; i++) {
            c[i] = lin[copyWordList.indexOf(beginWord)][i];
        }

        Map<String, Integer> v2i = new HashMap<>();
        for (int i = 0; i < copyWordList.size(); i++) {
            v2i.put(copyWordList.get(i), i);
        }


        List<String> sour = new ArrayList<>(Arrays.asList(beginWord));
        List<String> dest = new ArrayList<>(copyWordList);
        dest.remove(beginWord);
        while (!dest.isEmpty()) {
            String newWord = null;
            for (String d : dest) {
                for (String s : sour) {
                    long dis = lin[v2i.get(s)][v2i.get(d)];
                    if (dis < Integer.MAX_VALUE) {
                        long cur = c[v2i.get(d)];
                        c[v2i.get(d)] = Math.min(c[v2i.get(s)] + dis, cur);
                        newWord = d;
                    }
                }
                if (newWord != null) {
                    break;
                }
            }
            if (newWord != null) {
                dest.remove(newWord);
                sour.add(newWord);
            } else {
                break;
            }
        }
        return c[v2i.get(endWord)] == Integer.MAX_VALUE ? 0 : (int) c[v2i.get(endWord)] + 1;
    }

    boolean canchange(String from, String to) {
        int dffCnt = 0;
        for (int j = 0; j < from.length(); j++) {
            if (from.charAt(j) != to.charAt(j)) {
                dffCnt++;
            }
        }
        if (dffCnt == 1) {
            return true;
        }
        return false;
    }
}
