package com.cskaoyan.mall.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * GetRequestPayload工具类用来处理request PayLoad请求参数
 */
public class GetRequestPayload {

    public static Map getRequestPayload(HttpServletRequest req){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader reader = req.getReader()) {
            char[]buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        String result = sb.toString();
        HashMap<String, String> map = new HashMap<>();
        if (!result.isEmpty()){
            //去除括号
            String substring = result.substring(1, result.length()-1);
            //分割数据键值对
            String[] split = substring.split(",");
            //分割键和值放入map中
            for (String s : split) {
                String[] strings = s.split(":");
                try{
                    //put之前去除""

                    map.put(strings[0].replace("\"",""),strings[1].replace("\"",""));
                }catch (Exception e){
                    throw new RuntimeException("数据异常");
                }
            }
        }

        return map;
    }

}
