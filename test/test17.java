package com.itheima.test;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {

        //自己练习(test16)

        //输入两个数字表示范围
        //既可以和2整除,有可以和3整除的个数

        //分析:
        //1.键盘录入两个数字,表示范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围:");
        int beagin = sc.nextInt();
        System.out.println("请输入一个数字表示范围:");
        int end = sc.nextInt();

        //2统计变量
        //简单理解:统计符合要求的数字个数
        int count = 0;
        for (int i = beagin; i <= end; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
