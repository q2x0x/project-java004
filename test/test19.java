package com.itheima.test;

public class test19 {
    public static void main(String[] args) {

        //test18练习

        //纸张的厚度是0.2mm
        //山峰的高度是1,000,000mm
        //分析:折叠纸张:每一次折叠都是原来的二倍

        //定义闪山峰的高度
        double height = 1000000 ;
        //定义纸张的厚度;
        double paper = 0.1;

        int count = 0;

        while (paper < height){
            paper = paper * 2;
            count++;
        }
        System.out.println(count);


    }
}
