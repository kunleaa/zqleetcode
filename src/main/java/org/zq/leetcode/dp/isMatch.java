package org.zq.leetcode.dp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class isMatch {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        p.replace(".", "\\w");
        Pattern pa = Pattern.compile(p);
        Matcher mc = pa.matcher(s);
        if (mc.find()) {
            if (mc.group().equals(s)) {
                return true;
            }
        }

        return false;
    }
}
