package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        //键盘录入一个整数,如果身上的钱大于100,就去网红餐厅
        //小于100的话就去沙县小吃

        //分析:
        //1.键盘录入一个整数,表示身上的钱.
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入口袋的money值:");
        int money = sc.nextInt();

        //2.对钱进行判断(二选一)
        if (money >= 100){
            System.out.println("芜湖?我这么有钱!去网红餐厅干饭!");
        }else {
            System.out.println("还是去沙县小吃吧!");
        }


    }
}
