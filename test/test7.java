package com.itheima.test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {

        //购物共1000元
        //会员一级:打九折
        //会员二级:打八折
        //会员三级:打七折
        //非会员:不打折

        //1.定义变量
        int price = 1000;

        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您会员的级别:");
        int vip = sc.nextInt();

        //3.判断会员级别
        //会员的级别一共是三级,所以输入其他的属于不符合
        if (vip <= 3){
            if (vip == 1){
                System.out.println("实际支付" + (1000 * 0.9) + "元");
            }else if(vip == 2){
                System.out.println("实际支付" + (1000 * 0.8) + "元");
            }else{
                System.out.println("实际支付" + (1000 * 0.7) + "元");
            }
        }else{
            System.out.println("打骨折!!!");
        }

    }
}
