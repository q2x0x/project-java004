package com.itheima.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

        //商品的总价钱是600元
        //键盘录入一个整数,如果大于600,就支付成功
        //小于600,就支付失败

        //分析
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请支付:");
        int money = sc.nextInt();

        //2.判断
        if (money >= 600){
            System.out.println("支付成功!");
        }else {
            System.out.println("支付失败!");
        }
    }
}
