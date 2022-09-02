package com.itheima.switchdemo;

public class switchdemo1 {
    public static void main(String[] args) {

        //兰州拉面 武汉热干面 北京炸酱面 陕西油泼面

        //1.定义变量,记录心里面想吃的面
        String noodles = "河南烩面";

        //2.拿着心里面这个面去和这四种面比较
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方面面!");
                break;
        }
    }
}
