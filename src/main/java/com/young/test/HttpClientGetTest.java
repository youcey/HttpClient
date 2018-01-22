package com.young.test;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

public class HttpClientGetTest {
    public static void main(String[] args){
        String url = "http://www.baidu.com";
        //创建一个客户端，类似与打开一个浏览器
        HttpClient httpClient = new HttpClient();
        //创建一个get方法，类似于在浏览器中输入地址
        GetMethod getMethod = new GetMethod(url);
        try {
            //相当于回车，获得相应状态码
            int statusCode = httpClient.executeMethod(getMethod);
            System.out.println("statusCode:"+statusCode);
            //查看命中情况，可以获得很多东西，比如header,cookie等
            System.out.println("response:"+getMethod.getResponseBodyAsString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放
            getMethod.releaseConnection();
        }
    }
}
