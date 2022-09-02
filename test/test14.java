package com.itheima.test;

public class test14 {
    public static void main(String[] args) {

        //分析:
        //1.循环1~5得到里面的每个数字
        //2.开始条件:1
        //2.结束条件:5

        //用来进行累加的
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            //System.out.println(i);
            //我们可以把每一个数字累加到sun中
            sum = sum + i;

        } //当循环结束的时候,sun已经将1~5累加的值放到了sun中
        System.out.println(sum);

    }
}
