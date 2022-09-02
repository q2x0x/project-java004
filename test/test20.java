package com.itheima.test;

public class test20 {
    public static void main(String[] args) {

        //题目:计算回文数
        //回文数:121(正着读和反着读都是一样的)

        //核心思路:把数字倒过来跟原来的数字进行比较

        //1.定义数字
        int x = 1001;

        //定义一个临时变量用于记录x原来的值,用于最后进行比较
        int temp = x;

        //记录倒过来之后的结果
        int num = 0;

        //2.利用循环开始
        while (x!= 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;

        }
        //3.打印num
        System.out.println(num);
        System.out.println(x);

        //4.比较
        System.out.println(num == temp );


    }
}
