package com.itheima.test;

public class test18 {
    public static void main(String[] args) {

        //题目:珠穆朗玛峰

        //分析:折叠纸张:每一次折叠都是原来的二倍;
        //double a = 0.1;
        //a = a * 2;  or a *= 2;

        //1.定义一个变量来记录山峰的高度
         double height = 8844430;

        //2.定义一个变量来记录初始化厚度
        double paper = 0.1;

        //3.定义一个变量用来统计次数
        int count = 0;
        //3.循环折叠纸张,只要纸张的厚度小于山峰的高度,那么循环记继续
        //每折叠一次,统计次数都要++
        //要选择while循环的理由:因为此时我们知道循环的次数要范围,只知道循环的结束,所以用while
        while(paper < height){
            //折叠纸张
            paper = paper * 2;
            //折叠一次,++一次
            count++;
        }
        //当循环结束之后,count记录的值就是折叠的次数
        System.out.println(count);
    }
}
