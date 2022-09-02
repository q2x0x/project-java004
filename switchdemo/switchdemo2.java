package com.itheima.switchdemo;

//deflater的位置和他得省略

//1.位置:deflater可以写在任何地方,不一定能非要是下面,但是建议写在最下面
//2.省略:deflater可以省略,语法不会出现错误,但是不建议!

public class switchdemo2 {
    public static void main(String[] args) {
        int number = 1;
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
