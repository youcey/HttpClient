package com.young.test;

/**
 * 一个线程具有四个状态：
 *  1、新建状态
 *  2、可执行状态
 *  3、死亡状态
 *  4、阻塞状态
 */
public class MyThread2 implements Runnable {
    int count= 1, number;
    public MyThread2(int num){
        number = num;
        System.out.println("创建线程 " + number);
    }
    public void run(){
        while(true){
            System.out.println("线程 " + number + ":计数 " + count);
            if(++count== 6) return;
        }
    }
    public static void main(String args[]){
        for(int i = 0; i < 5; i++)
            new Thread(new MyThread2(i+1)).start();
    }
}
