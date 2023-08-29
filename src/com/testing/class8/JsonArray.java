package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 22:18
 */
public class JsonArray {
    public static void main(String[] args) {
        String res = "{\n" +
                "    \"code\":200,\n" +
                "    \"data\":[\n" +
                "        {\n" +
                "            \"entityId\":\"64b75e016af6a01f036cf0e2\",\n" +
                "            \"variableId\":\"64b8982f7f0c1d11e6b34349\",\n" +
                "            \"entityName\":\"时间\",\n" +
                "            \"variableName\":\"信息采集动态变量001\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"entityId\":\"64b75e016af6a01f036cf0e6\",\n" +
                "            \"variableId\":\"64b8d1ec661685228ae06e5b\",\n" +
                "            \"entityName\":\"过去日期\",\n" +
                "            \"variableName\":\"信息采集动态变量003\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"requestId\":\"80H8lUbD\",\n" +
                "    \"resultMsg\":\"执行成功\",\n" +
                "    \"host\":\"daily-acp-03\",\n" +
                "    \"errorStackTrace\":null\n" +
                "}";

        System.out.println(JSONPath.read(res, "$.data.entityVariableMappingList[1].variableName"));

        JSONObject jsonObject = JSON.parseObject(res);

        //map
        HashMap<String, String> strMap = new HashMap<>();
        HashMap<String, Object> objMap = new HashMap<>();


        Set<String> jsonKey = jsonObject.keySet();
        System.out.println("*******Respnse********");
        for (String key : jsonKey) {
            System.out.println(key + "的值为:" + jsonObject.get(key));

            //存储为 string string格式
            if (jsonObject.get(key) != null) {
                strMap.put(key, jsonObject.get(key).toString());
            }

            //判断value是否为数组
            if (jsonObject.get(key) instanceof JSONArray) {
                System.out.println(key + "的值是一个数组");
                JSONArray resultArray = (JSONArray) jsonObject.get(key);
                JSONObject resultJson = (JSONObject) resultArray.get(0);
                System.out.println(key + "的内容是" + resultJson);
                objMap.put(key, resultJson);

            } else {
                String string = jsonObject.getString(key);
                objMap.put(key, string);
            }

        }
        System.out.println(strMap);
        System.out.println(objMap);


    }


}