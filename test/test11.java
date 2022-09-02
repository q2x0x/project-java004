package com.itheima.test;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        //订机票服务

        //分析:
        //1.键盘录入我们的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int choose = sc.nextInt();

        //2.根据代码执行逻辑
        switch (choose){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票改签");
                break;
            case 3:
                System.out.println("退出服务");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务!");
                break;
        }

    }
}
