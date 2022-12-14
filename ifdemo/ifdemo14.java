package com.itheima.ifdemo;

public class ifdemo14 {
    public static void main(String[] args) {

        /*题目6（较难）
        已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

        训练提示:
        1949到2019有很多年？逐个判断这么多年份肯定要用循环。
        用什么条件来判断是否是猪年？

        解题方案:
        使用for循环逐年判断，根据2019是猪年这个条件，使用if来判断其他是猪年的年份。

        操作步骤:
        定义for循环，1949到2019的年份是循环次数。
        对每个年份逐个判断，如果年份和2019的差值是12的倍数，说明这年是猪年
        打印符合条件的年份*/

        //1.循环的开始是1949年,结束是2019年
        for (int i = 1949; i < 2019; i++){
            //2.如果年份和2010年的差值是12的倍数,则说明是猪年
            if ((2019 - i) % 12 == 0){
                //3打印符合条件的年份
                System.out.println(i);
            }
        }
    }
}
