package com.itheima.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        //标记标记标记!!!
        //电影买票座位

        //分析:

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个序号:");
        int number = sc.nextInt();

        //只有当number在1-100这个范围内才行
        //if的嵌套
      /*  if (number >= 1 && number <= 100){

            //2.判断
            if (number % 2 ==1){
                System.out.println("坐左边!");
            }else {
                System.out.println("坐右边!");
            }
        }*/


      //改进:

        //只有当number在1-100这个范围内才行
        //if的嵌套
        if (number >= 1 && number <= 100){

            //2.判断
            if (number % 2 ==1){
                System.out.println("坐左边!");
            }else if (number % 2 ==0){
                System.out.println("坐右边!");
            }                                 //在进行到else的时候,要空一个 } 才可正常运行!
        }else {
            System.out.println("请您输入正确的座位!");
        }

    }
}
