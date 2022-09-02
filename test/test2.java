package com.itheima.test;

public class test2 {
    public static void main(String[] args) {

        //汽车无人驾驶涉及到的判断
        //当汽车行驶到红绿灯的时候,会选择判断
        //如果红灯亮,就停止
        //如果黄灯亮,就减速
        //如果绿灯亮,就行驶

        //1.定义灯的状态
        //true 亮 false 灭
        boolean isLightGree = true;
        boolean isLightyellow = false;
        boolean isLightred = false;


        //2.判断
        //如果红灯亮,就停止
        //如果黄灯亮,就减速
        //如果绿灯亮,就行驶

        if (isLightGree) {
            System.out.println("GoGoGo!!!");
        }if (isLightyellow) {
            System.out.println("slow");
        }if (isLightred) {
            System.out.println("stop");
        }
    }
}
