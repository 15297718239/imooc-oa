package com.imooc.oa.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class Md5UtilsTest {

    @Test
    public void md5Digest1() {
        String md5 = Md5Utils.md5Digest("123456");
        System.out.println(md5);
    }

    @Test
    public void md5Digest2() {
        String md5 = Md5Utils.md5Digest("123456",888);
        System.out.println(md5);
    }
}