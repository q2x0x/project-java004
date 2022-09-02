package com.itheima.test;

public class test22 {
    public static void main(String[] args) {

        //练习test21

        //定义被除数
        int dividend = 123;
        //定义除数
        int divisor = 20;
        //统计变量
        int count = 0;

        while(dividend >= divisor){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商为" + count);
        System.out.println("余数为" + dividend);
    }
}
