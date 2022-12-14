package com.itheima.ifdemo;

public class ifdemo15 {
    public static void main(String[] args) {
        /*题目7（较难）
        中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
        （年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
        请打印出1988年到2019年的所有闰年年份。

        训练提示:
        从1988年到2019年有很多年，每年都需要判断，用什么知识点对每年进行判断？

        解题方案:
        使用while循环完成
        使用for循环完成

        以下以方案2为准

        操作步骤:
        定义for循环，循环开始是1988，结束是2019
        在循环中对年份进行判断
        如果符合闰年的判断条件，则打印该年份*/

        //1.循环的开始是1988年,结束是2019年
        for (int year = 1988; year <= 2019; year++){
            //2.如果年份可以被四整除和400整除,但不能被100整除,就是闰年
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                System.out.println(year + "是闰年");
            }
        }
        System.out.println();
    }
}
