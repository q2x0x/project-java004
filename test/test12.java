package com.itheima.test;

public class test12 {
    public static void main(String[] args) {

        //需求:打印1~5;

        //分析:

        //开始条件1
        //结束条件5
        /*for (int i = 1; i <= 5; i++ ){
            //第一次循环:i = 1
            //第二次循环:i = 2
            //i= 1,2,3,4,5
            System.out.println(i);

        }*/



        //需求:打印5~1;

        //分析:
        //开始条件5
        //结束条件1

        for (int i = 5; i >= 1; i-- ){
            //第一次循环:i = 5
            //第二次循环:i = 4
            //i= 5,4,3,2,1
            System.out.println(i);

        }
    }
}
