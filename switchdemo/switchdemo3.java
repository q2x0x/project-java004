package com.itheima.switchdemo;

public class switchdemo3 {
    public static void main(String[] args) {

        //case穿透:
            //1.就是语句体中没有break导致的
        //执行梳理:
            //2.首先还是胡拿着小括号里的语句和下面的语句进行比较
            //如果匹配上了,就会执行对应的语句,发现了break语句,就会结束整个语句
            //如果没有break语句,程序会继续执行下一个操作,直到有breaK,或者有大括号为止

        //使用场景:
        //如果对个case的语句体重复;了,我们就可以考虑到case穿透去简化代码;
        int number = 10;
        switch (number){
            case 1 :
                System.out.println("number的值为1");
                break;
            case 10 :
                System.out.println("number的值为10");
                break;
            case 20 :
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("不符合要求!");
                break;
        }
    }

}
