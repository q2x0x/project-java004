package com.itheima.test;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {

        //需求:键盘录入星期数,输出工作日,休息日
        //(1-5)工作日
        //(6-7休息日)

        //分析:
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int week = sc.nextInt();

        // 2.利用Switch语句判断
        //case穿透,减少到代码量
        //jdk的版本越高,代码可以更简
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入格式错误!");
                break;

        }

        }
    }

