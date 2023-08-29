package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.util.HashMap;
import java.util.Set;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 23:25
 */
public class SimpleJson {
    public static void main(String[] args) {
        String text = "{\n" +
                "    \"code\":200,\n" +
                "    \"data\":\"hello\",\n" +
                "    \"requestId\":\"80H8lUbD\",\n" +
                "    \"resultMsg\":\"执行成功\",\n" +
                "    \"host\":\"daily-acp-03\",\n" +
                "    \"errorStackTrace\":null\n" +
                "}";
        //转为json对象
        JSONObject jsonObject = JSON.parseObject(text);
        System.out.println(jsonObject);

        //获取keySet
        Set<String> keySet = jsonObject.keySet();

        //存储为map
        HashMap<String, Object> objMap = new HashMap<>();

        //遍历
        for (String key : keySet) {
            System.out.println(key+"的值是:"+jsonObject.get(key));
            objMap.put(key,jsonObject.getString(key));
            //获取的时候 特定使用字符串
//            if (jsonObject.get(key) !=null) {
//                objMap.put(key,jsonObject.get(key).toString());
//            }else {
//                objMap.put(key,jsonObject.getString(key));
//            }


        }
        System.out.println(objMap);


        //将map拼接为一个json字符串
        String reJson ="{";
        for (String key : keySet) {
            if (jsonObject.get(key) instanceof String) {
                reJson+="\""+key+"\":\""+jsonObject.get(key)+"\",";
            } else {
                reJson+="\""+key+"\":"+jsonObject.get(key)+",";
            }
        }
        //截取字符串并且拼接
        reJson=reJson.substring(0,reJson.length()-1)+"}";
        System.out.println(reJson);





    }

}