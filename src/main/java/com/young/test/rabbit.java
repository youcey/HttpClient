package com.young.test;

/**
 *  兔子问题：
 *  斐波那契数列求值
 *  题目：古典问题：有一对兔子、从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一堆兔子，假如兔子不死，问每个月的兔子总数为多少？
 *  分析：兔子的规律数为：1，1，2，3，5，8，13，21……
 */
public class rabbit {
    public static void MyFunction(int months){
        //上上个月生的兔子的数量
        int lastTwoMonthNum = 0;
        //上个月生的兔子的数量
        int lastMonthNum = 0;
        //总数量
        int count = 1;
        for(int month = 1;month <= months;month++){
            int giveBith = lastMonthNum + lastTwoMonthNum;
            if(month == 3){
                giveBith = 1;
            }
            lastTwoMonthNum = lastMonthNum;
            lastMonthNum = giveBith;
            count = count + lastMonthNum;
            System.out.println("第" + month + "个月的兔子为" + count + "对");
        }
    }
    public static int fib(int month){
        if(month == 1 || month == 2){
            return 1;
        }else{
            return fib(month - 1) + fib(month - 2);
        }
    }

    public static void main(String[] args){
        MyFunction(20);
    }
}
