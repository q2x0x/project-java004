package com.itheima.test;

public class test21 {
    public static void main(String[] args) {

        //需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围
        //将两数相除，要求不使用乘法、除法和%运算符。
        //得到商和余数。

        //1.定义变量记录被除数
        int dividend = 100;

        //2.定义变量记录除数
        int divisor = 10;

        //3.定义一个变量用来统计相减了多少次
        int count = 0;

        //3.循环 while
        //在循环中不断用被除数去减除数
        //只要被除数是大于等于除数的,那么挤一直循环
        while(dividend >= divisor){
            dividend = dividend - divisor;
            //只要减一次,那么统计变量就会自增一次
            count++;
        }
        //当循环结束后,count记录的值就是商
        System.out.println("商为:" + count);
        //当循环结束后dividend变量记录的就是余数
        System.out.println("余数为:" + dividend);
    }
}
