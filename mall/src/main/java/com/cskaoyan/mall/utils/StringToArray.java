package com.cskaoyan.mall.utils;

public class StringToArray {

    public static String[] strToArr(String source){
        int length = source.length();
        if (source!=null && length>0) {
            String substring = source.substring(1, length-1);
            return substring.split(",");
        }
        return null;
    }
}
