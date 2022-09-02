package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(String[] args) {

        //day4练习题(方法一)

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

        //2.判断大小

        //先判断前两个数,且定义一个变量temp
        int temp = number1 < number2 ? number1 : number2;
        //再拿着变量和第三个数进行比较
        int min = number3 < temp ? number3 : temp;
        //输出打印
        System.out.println("最小的数是" + min + "!");



    }
}
