package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo13 {
    public static void main(String[] args) {

        //题目二
        /*
        需求：键盘录入两个数字，表示一个范围。
​        统计这个范围中
​        既能被3整除，又能被5整除数字有多少个？

        训练提示:
        需要先判断键盘录入两个数字的大小关系
        确定大小之后，可以循环得到范围里面的每一个数
        找到一个符合条件的数字，统计变量就自增一次

        操作步骤:
        确定键盘录入的两个数字大小关系
        定义for循环，找到范围之内的每一个数字
        对每一个数字进行判断
        符合条件统计变量自增一次*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();

        //2判断两个数字大小
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        int count = 0;
        for (int i = min; i <= max; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
