package com.itheima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        //根据小明的成绩来送礼物
        //95-100 自行车
        //90-94 游乐场玩
        //80-89 变形金刚
        //80以下  揍一顿

        //1.键盘录入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int grades = sc.nextInt();

        //对异常数据判断效验(当输入大于100的时候,不符合!)
        //0-100才是合理的
        if (grades >= 0 && grades <= 100){

            //2.判断
            if (grades >=95 && grades <= 100){
                System.out.println("荣获自行车一辆!!!");
            }else if (grades >=90 && grades <= 94){
                System.out.println("去游乐场玩一天吧!!");
            }else if (grades >=80 && grades <= 89){
                System.out.println("获得变形金刚一个!");
            }else{                                //在这里就不需要在输入一个小括号()了!
                System.out.println("暴揍一顿!!!");
            }
        }else {
            System.out.println("输入的格式不对!");
        }
    }
}
