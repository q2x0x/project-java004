package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo12 {
    public static void main(String[] args) {

        /*三、循环语句作业
        题目1
​        键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。

        训练提示:
        number1和number2不知道谁大谁小，需要先判断大小关系
        确定大小之后，可以循环得到范围里面的每一个数
        把每一个数字进行累加即可*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        int sun = 0;
        for (int i = min; i <= max; i++){
           sun = sun + i;
        }
        System.out.println(sun);




    }
}
