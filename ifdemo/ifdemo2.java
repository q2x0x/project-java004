package com.itheima.ifdemo;

public class ifdemo2 {
    public static void main(String[] args) {

        //day4练习题

        //题目一
        //李雷想买一个价值7988元的新手机，
        // 她的旧手机在二手市场能卖1500元，
        // 而手机专卖店推出以旧换新的优惠，
        // 把她的旧手机交给店家，新手机就能够打8折优惠。
        // 为了更省钱，李雷要不要以旧换新？

        //分析:
        //使用if...else语句判断
        //计算不使用以旧换新时的花费。
        //计算使用以旧换新时的花费。
        //使用if..else语句判断哪种方式更省钱

        //1.定义不以旧换新的的花费
        int money1 = 7988 - 1500;

        //2.定义以旧换新的花费;
        double money2 = 7988 * 0.8;

        //3.判断
        if (money1 > money2){
            System.out.println("不使用以旧换新更省钱!");
        }else {
            System.out.println("使用以旧换新更省钱!");
        }
    }
}
