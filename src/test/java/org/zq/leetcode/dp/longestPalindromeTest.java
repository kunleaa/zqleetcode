package org.zq.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class longestPalindromeTest {

    @Test
    public void longestPalindrome() {
        Assert.assertEquals("aba", new longestPalindrome().longestPalindrome("babad"));
    }


    @Test
    public void longestPalindrome2() {
        Assert.assertEquals("bb", new longestPalindrome().longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome3() {
        Assert.assertEquals("asbbsa", new longestPalindrome().longestPalindrome("asbbsa"));
    }
}