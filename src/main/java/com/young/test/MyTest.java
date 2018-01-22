package com.young.test;

public class MyTest {
    public static void main(String[] args){
        String[] str = {".js",".css",".png","jpg","gif",".bmp",".woff",".ttf"};
        String url = "http://localhost:8083/resource/criminal/js/featured.js?v=5_10";

        for(int i=0;i<str.length;i++){
            String s = str[i];
            System.out.println(s);
            if(url.contains(s)){
                System.out.println("通过1");
            }else{
                if(url.indexOf(".") > 0){
                    System.out.println("请求地址中含有特殊字符，已拦截");
                }else{
                    System.out.println("通过2");
                }
            }
        }
    }
}
