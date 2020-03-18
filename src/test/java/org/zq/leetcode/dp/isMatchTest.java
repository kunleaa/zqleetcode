package org.zq.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class isMatchTest {

    @Test
    public void isMatch() {
        Assert.assertEquals(false, new isMatch().isMatch("aabc", "ab"));
    }


    @Test
    public void isMatch1() {
        Assert.assertEquals(true, new isMatch().isMatch("aabc", "a*b*c"));
    }

    @Test
    public void isMatch3() {
        Assert.assertEquals(true, new isMatch().isMatch("aasdfabc", ".*"));
    }

    @Test
    public void isMatch4() {
        Assert.assertEquals(false, new isMatch().isMatch("mississippi", "mis*is*p*."));
    }
}