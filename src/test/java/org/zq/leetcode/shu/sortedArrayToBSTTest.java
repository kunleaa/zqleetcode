package org.zq.leetcode.shu;

import org.junit.Assert;
import org.junit.Test;

public class sortedArrayToBSTTest {
    @Test
    public void test1() {
        int[] a = {-10, -3, 0, 5, 9};
        Assert.assertEquals(true, new sortedArrayToBST().sortedArrayToBST(a));
    }
}