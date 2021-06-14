package com.imooc.oa.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Utils {
    /**
     * 对源数据生成MD5摘要
     * @param source 源数据
     * @return MD5摘要
     */
    public static String md5Digest(String source){
        return DigestUtils.md5Hex(source);
    }
    /**
     * 对源数据加盐混淆后生成MD5摘要
     * @param source 源数据
     * @param salt 盐值
     * @return MD5摘要
     */
    public static String md5Digest(String source,Integer salt){
        char[] chars = source.toCharArray();
        for (int i= 0 ; i< chars.length ; i++){
            chars[i] = (char) (chars[i] + salt);
        }
        String target = new String(chars);
        //System.out.println(target);
        String md5 = DigestUtils.md5Hex(target);
        return md5;
    }
}
