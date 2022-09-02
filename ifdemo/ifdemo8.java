package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo8 {
    public static void main(String[] args) {

        //题目四练习

        /*某商场购物可以打折，具体规则如下：

​        普通顾客购不满100元不打折，满100元打9折；
​        会员购物不满200元打8折，满200元打7.5折；

​        不同打折规则不累加计算。

        请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）
        和购物的折前金额（整数即可），输出应付金额（小数类型）。

        训练提示:
        使用什么方式让用户输入内容？
        使用哪种if语句的格式对信息作出判断？

        解题方案:
        使用Scanner键盘录入和if..else判断语句的嵌套使用来完成。

        操作步骤:
        键盘录入会员类别和购物金额。
        先使用if-else判断顾客类别。
        在不同的顾客类别中再使用if-else语句判断购物金额。
        输出结果。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的级别(0表示普通顾客，1表示会员）:");
        int tepy = sc.nextInt();
        System.out.println("请输入购物金额:");
        int money = sc.nextInt();

        if (tepy == 0){
            if (money >0 && money < 100){
                System.out.println("您应付" + money + "元");
            }else if (money >= 100){
                System.out.println("应付" + money * 0.9 + '元');
            }else{
                System.out.println("输入的格式错误!");
            }
        }else if(tepy == 1){
            if (money > 0 && money <200){
                System.out.println("应付" + money * 0.8 + '元');
            }else if(money >= 200){
                System.out.println("应付" + money * 0.75 + '元');
            }
        }else{
            System.out.println("您输入的类型错误!");
        }
    }
}
