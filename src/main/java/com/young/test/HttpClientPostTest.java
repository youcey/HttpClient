package com.young.test;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

public class HttpClientPostTest {

    public static void main(String[] args) throws IOException {
        String url = "http://www.baidu.com";
        //创建一个客户端，类似与打开一个浏览器
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        //得到post方法
        PostMethod postMethod = new PostMethod(url);
        //使用数组来传递参数
        NameValuePair[] postData = new NameValuePair[2];
        postData[0] = new NameValuePair("name","admin");
        postData[0] = new NameValuePair("password","123456");
        postMethod.addParameters(postData);

        //回车，获得响应状态
        int statusCode = httpClient.executeMethod(getMethod);
        System.out.println("statusCode:"+statusCode);

        //查看命中情况
        System.out.println("response:"+getMethod.getResponseBodyAsString());
//        System.out.println("response:"+postMethod.getResponseBodyAsString());

        //释放
        getMethod.releaseConnection();
        postMethod.releaseConnection();
    }
}
