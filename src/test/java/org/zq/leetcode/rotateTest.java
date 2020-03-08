package org.zq.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class rotateTest {

    @Test
    public void test1() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] r = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        new rotate().rotate(a);
        Assert.assertEquals(JSON.toJSON(r), JSON.toJSON(a));
    }
}