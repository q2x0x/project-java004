package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    public static void main(String[] args) {

        //day4练习题(方法二)

        //题目二:
        //让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。

        //分析:
        /*如何完成用户录入？
          求最小值需要用到什么知识点？

        解题方案:
        使用Scanner键盘录入三个数字，使用三元运算符实现
        使用Scanner键盘录入三个数字，使用if..else的嵌套实现（不做要求）

        操作步骤:
        使用三次键盘录入的方法让用户输入三个整数
        使用三元运算符求出最小值
         打印输出最小值*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int number2 = sc.nextInt();
        System.out.println("请输入第三个数字:");
        int number3 = sc.nextInt();

        //定义变量代表最小值:
        int min;

        //对三个数进行判断
        if(number1 < number2 && number1 < number3){
            min = number1;
        }else if(number2 < number1 && number2 < number3){
            min = number2;
        }else{
            min = number3;
        }
        //打印最小值
        System.out.println("最小值是" + min);

    }
}
