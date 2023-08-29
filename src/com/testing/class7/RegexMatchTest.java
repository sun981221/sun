package com.testing.class7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: sun
 * @description:
 * @author: Sun
 * @create: 2023-08-13 17:51
 */
public class RegexMatchTest {
    public static void main(String[] args) {
        /*
        <a href="http://news.baidu.com" target="_blank" class="mnav c-font-normal c-color-t">新闻</a>
        <a href="http://map.baidu.com" target="_blank" class="mnav c-font-normal c-color-t">地图</a>
        <a href="http://tieba.baidu.com/" target="_blank" class="mnav c-font-normal c-color-t">贴吧</a>
        <div class="s-top-more-title c-font-normal c-color-t">翻译</div>
        <div class="s-top-more-title c-font-normal c-color-t">百科</div>
         */

        String strUrl= "<a href=\"http://news.baidu.com\" target=\"_blank\" class=\"mnav c-font-normal c-color-t\">新闻</a>" ;

        //定义正则表达式模板,用来搜索查找
        Pattern getUrlAndName = Pattern.compile(".+href=\"(.*)\".target.*>(.*)</a");
        //通过pattern的mactcher对象进行匹配操作
        Matcher matcher = getUrlAndName.matcher(strUrl);
        System.out.println(matcher.groupCount());
        if(matcher.find()){
            System.out.println(matcher.groupCount());
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));

            }
        }else {
            System.out.println("未匹配到");
        }


    }


}