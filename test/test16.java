package com.itheima.test;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {

        //分析:
        //1.键盘录入两个数字,表示范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数表示范围的开始:");
        int begin = sc.nextInt();
        System.out.println("请输入一个数表示范围的结束:");
        int end = sc.nextInt();

        //统计变量
        //简单理解:统计符合要求的数字个数
        int count = 0;

        //2.利用循环获取这个范围
        //开始条件:begin;
        //结束条件:end;
        for (int i = begin; i <= end; i++) {

            //3.对每哥数字进行判断,统计有多少个满足要求的数字
            if (i % 3 == 0  && i % 5 == 0){
                //System.out.println(i);
                count++;
            }
        }System.out.println(count);
    }
}
