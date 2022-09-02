package com.itheima.ifdemo;

import com.sun.deploy.config.WinPlatform;
import javafx.scene.chart.NumberAxis;

import java.util.Scanner;

public class ifdemo11 {
    public static void main(String[] args) {
        /*二、switch选择语句作业
        题目1
        模拟计算器功能，对键盘录入的两个int类型的数据进行
        加、减、乘、除的运算，并打印运算结果。

       要求：
​       键盘录入三个整数,其中前两个整数代表参加运算的数据，
       第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
​       请输入第一个整数: 30
​       请输入第二个整数: 40
​       请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
​       控制台输出:30+40=70

        训练提示:
        用户录入了数据之后，用什么知识点去判断加减乘除四种不同的操作？

        解题方案:
        使用switch判断语句完成。

        操作步骤:
        使用键盘录入三个变量。
        使用switch判断语句对第三个变量进行判断，匹配要执行的操作。
        在每一个case中分别对第一个变量和第二个变量进行不同的操作。*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();
        System.out.println("请输入您要进行的运算:(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)");
        int type= sc.nextInt();

        //2.判断使用什么运行法则
        switch (type){
            case 1 :
                System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
                break;
            case 2 :
                System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
                break;
            case 3 :
                System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
                break;
            case 4 :
                System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
                break;
            default:
                System.out.println("您输入的运算类别有误!");
                break;
        }

        }
    }

