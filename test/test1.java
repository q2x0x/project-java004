package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        //小红:如果你考试全班第一,我就做你女朋友.

        //分析:
        //1.定义一个变量记录小明的名次

        /*int ranking = 1; //如果不是1的话,结果就不会打印
        if(ranking == 1){
            System.out.println("小红成为小明的女朋友!");
        }else if (ranking != 1){

        }*/


        //方法二 (键盘录入)
        //小红:如果你考试全班第一,我就做你女朋友.
        //键盘录入小明的排名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的排名:");
        int grades = sc.nextInt();

        if (grades == 1){
            System.out.println("小红成为小明的女朋友!!!");
        }else if (grades != 1){
            System.out.println("小红:" + "你扯什么犊子呢,我能做你女朋友?");
        }

    }
}
