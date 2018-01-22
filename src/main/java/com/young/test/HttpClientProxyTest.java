package com.young.test;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;

public class HttpClientProxyTest {
    public static void main(String[] args){
        //创建一个HrrpClient 相当于打开一个代理
        HttpClient httpClient = new HttpClient();

        //设置代理服务器的IP和端口
        httpClient.getHostConfiguration().setProxy("127.0.0.1",8080);

        //告诉httpClient，使用抢先验证，否则你会收到“没有资格”的恶果
        httpClient.getParams().setAuthenticationPreemptive(true);

//        httpClient.getParams().setParameter(CredentialsProvider.PROVIDER,new MyProxyCredentialsprovider());

        //设置代理服务器的用户名和密码
        httpClient.getState().setProxyCredentials(new AuthScope("127.0.0.1",AuthScope.ANY_PORT,AuthScope.ANY_REALM),
                new UsernamePasswordCredentials("username","password"));
    }
}
