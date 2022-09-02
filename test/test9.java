package com.itheima.test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

        //题目:键盘录入一个星期数,匹配需要的项目
        //周一:跑步
        //周二:读书
        //周三:爬山
        //周四:游泳
        //周五:学习
        //周六:背书
        //周日:睡大觉

        //1.键盘录入星期数
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int week = sc.nextInt();

        //2.使用Switch进行匹配
        switch (week){
            case 1:
                System.out.println("周一去跑步");
                break;
            case 2:
                System.out.println("周二去读书");
                break;
            case 3:
                System.out.println("周三去爬山");
                break;
            case 4:
                System.out.println("周四去游泳");
                break;
            case 5:
                System.out.println("周五去学习");
                break;
            case 6:
                System.out.println("周六去背书");
                break;
            case 7:
                System.out.println("周日去睡大觉");
                break;
            default:
                System.out.println("格式不对!");
                break;

        }
    }
}
