package com.itheima.test;

import java.sql.SQLOutput;

public class test15 {
    public static void main(String[] args) {

        //分析:

        //1.获取1~100之间的每个数
        //快速生成for方式 number.fori
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);

            //2.累加求和,(先判断再求和)
            if(i % 2 == 0){
                sum = sum + i;
            }
        }//打印sum
        System.out.println(sum);




    }
}
