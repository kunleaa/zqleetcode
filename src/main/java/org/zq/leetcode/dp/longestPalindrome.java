package org.zq.leetcode.dp;


/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        // f(i,i) = true
        // f(i, i+1) = s[i] == s[i+1]
        // f(i, j) = f(i + 1, j - 1) && s[i] == j[i]
        boolean[][] f = new boolean[s.length()][s.length()];
        int maxs = 0;
        int maxe = 0;
        for (int i = 0; i < s.length(); i++) {
            f[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            f[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            if (f[i][i + 1]) {
                maxs = i;
                maxe = i + 1;
            }
        }
        for (int l = 3; l <= s.length(); l++) {
            for (int i = 0; i <= s.length() - l; i++) {
                int end = i + l - 1;
                f[i][end] = f[i + 1][end - 1] && s.charAt(i) == s.charAt(end);
                if (f[i][end]) {
                    maxs = i;
                    maxe = end;
                }
            }
        }
        return s.substring(maxs, maxe + 1);
    }
}
