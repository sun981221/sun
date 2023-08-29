package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.util.Set;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 20:57
 */
public class JsonTest {
    private static String res = "{\n" +
            "  \"code\": 200,\n" +
            "  \"data\": {\n" +
            "    \"createUserId\": 1,\n" +
            "    \"updateUserId\": 10240,\n" +
            "    \"createTime\": \"2022-08-05 17:40:12\",\n" +
            "    \"updateTime\": \"2023-04-27 14:24:35\",\n" +
            "    \"userId\": 10240,\n" +
            "    \"tenantId\": 916,\n" +
            "    \"nickname\": null,\n" +
            "    \"name\": \"czy-test\",\n" +
            "    \"email\": \"15172376250@yiwise.com\",\n" +
            "    \"gender\": \"MALE\",\n" +
            "    \"phoneNumber\": \"15172376250\",\n" +
            "    \"password\": null,\n" +
            "    \"comment\": null,\n" +
            "    \"customerCountLimit\": -1,\n" +
            "    \"customerDaysLimit\": -1,\n" +
            "    \"robotCountLimit\": -1,\n" +
            "    \"wechat\": null,\n" +
            "    \"miniProgramUnionId\": null,\n" +
            "    \"miniProgramOpenId\": null,\n" +
            "    \"wxPublicAccountOpenId\": null,\n" +
            "    \"wxPublicAccountUnionId\": null,\n" +
            "    \"wxWebsiteOpenId\": null,\n" +
            "    \"wxWebsiteUnionId\": null,\n" +
            "    \"salt\": null,\n" +
            "    \"saltCount\": null,\n" +
            "    \"distributorId\": 0,\n" +
            "    \"job\": \"测试\",\n" +
            "    \"wxNickName\": null,\n" +
            "    \"wxHeadImgUrl\": null,\n" +
            "    \"avatarUrl\": null,\n" +
            "    \"canModifySpeech\": false,\n" +
            "    \"monitor\": true,\n" +
            "    \"enabledStatus\": \"ENABLE\",\n" +
            "    \"province\": null,\n" +
            "    \"city\": null,\n" +
            "    \"guideStatus\": null,\n" +
            "    \"recorderOptionIds\": null,\n" +
            "    \"jobToFolder\": true\n" +
            "  },\n" +
            "  \"requestId\": \"XbnZSdTN\",\n" +
            "  \"resultMsg\": \"登录成功\",\n" +
            "  \"host\": \"daily-acp\",\n" +
            "  \"errorStackTrace\": null\n" +
            "}";

    public static void main(String[] args) {
        //jsonpath
        System.out.println(JSONPath.read(res, "$.data.name"));

        //转成json
        String resName = JSONPath.read(res, "$.data.phoneNumber").toString();
        System.out.println(resName);

        //将字符串转化为fastjson中定义的json对象类
        JSONObject resJson = JSON.parseObject(res);
        Set<String> jsonKey = resJson.keySet();
        //便利
        for (String key : jsonKey) {
            System.out.println(key+"的值是:"+resJson.get(key));
            if(resJson.get(key) instanceof JSONArray){
                System.out.println(key+"的值是一个数组");
                JSONArray resultArray = (JSONArray) resJson.get(key);
                JSONObject resultJson = (JSONObject) resultArray.get(0);
                System.out.println(key+"的内容是"+resultJson);
            }
        }

        //获取为数组:getJSONArray
        JSONObject jsonData = resJson.getJSONObject("data");
        System.out.println("data的值为:"+jsonData);





    }


}
