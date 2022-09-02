package com.itheima.ifdemo;

import java.util.Scanner;

public class ifdemo5 {
    public static void main(String[] args) {

        //题目三
        //shift + esc(退出打印界面)

        //某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，
        // 到期凭存单支取本息。存款年利率表如下：

         /*存期 年利率（%）
       ​ 一年 2.25
        ​ 两年 2.7
​         三年 3.25
​         五年 3.6

        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。

        提示：
​        存入金额和存入年限均由键盘录入
​        本息计算方式：本金+本金×年利率×年限

         训练提示:
        使用什么方式让用户输入内容？
        使用哪种if语句的格式对信息作出判断？

        解题方案:
        使用Scanner和if..else...的嵌套操作。

        操作步骤:
        键盘录入金额和年份。
        使用多条件if...else判断年份，计算本息金额。
        输出结果。*/

         //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要存入的金额:");
        int money = sc.nextInt();
        System.out.println("请输入要存的年限:");
        int year = sc.nextInt();

        //定义本息和的变量
        double outMoney = 0;
        //根据利率和年限计算本息和
        if (year == 1){
            outMoney = money + money * 2.25 / 100 * 1;
        }else if (year == 2){
            outMoney = money + money * 2.7 / 100 * 2;
        }else if (year == 3){
            outMoney = money + money * 3.25/ 100 * 3;
        }else if (year == 5){
            outMoney = money + money * 3.6/ 100 * 5;
        }else {
            System.out.println("输入的年限有误!");
        }
        //打印输出
        System.out.println("存款" + year + "年后的本息是:" + outMoney);
    }
}