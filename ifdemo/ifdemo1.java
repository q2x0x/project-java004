package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {

        //需求:键盘录入女婿的酒量,大于2斤,老丈人就答应,反之不答应;

        //1.格式
        //(关系语句){
        // 语句体:
        // }

        //分析:
        //1.键盘录入女婿的酒量;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量:");
        int wine = sc.nextInt();

        //2.判断女婿的酒量;
        if(wine > 2){
            System.out.println("小伙子不错哇!");
        }
        if(wine <=2){
            System.out.println("怎么搞的,啊!不能喝去狗那一桌!");
        }

    }
}

/*
    if(关系表达式){
        语句体;
        }
     if的注意点:
            1.大括号的开头可以另起一行书写,但是还是建议书写在第一行的末尾
            2.在语句体中,如果只有一行代码,大括号可以省略(个人建议不要省略)
            3.如果对一个布尔类型的变量进行判断,不要用==号 直接把变量写在括号里即可
 */