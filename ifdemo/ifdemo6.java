package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo6 {
    public static void main(String[] args) {

        //题目三(练习)

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要存入的金额:");
        int money = sc.nextInt();
        System.out.println("请输入要存的年限:");
        int year = sc.nextInt();

        double outmoney = 0;

        if (year == 1){
            outmoney = money + money * 2.25 / 100 * 1;
        }else if (year == 2){
            outmoney = money + money *2.7 / 100 * 2;
        }else if (year == 3){
            outmoney = money + money *3.25 / 100 * 3;
        }else if (year == 5){
            outmoney = money + money *3.6 / 100 * 5;
        }else{
            System.out.println("输入的格式有误!");
        }
        System.out.println("存款" + year + "年后的本息是" + outmoney);
    }
}
