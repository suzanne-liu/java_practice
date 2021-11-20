package come.testing.class7;

import java.util.Scanner;

/**
 * @Classname RegexTest
 * @Description 类型说明
 * @Date 2021/8/20 20:56
 * @Created by 特斯汀Roy
 */
public class RegexTest {
    public static void main(String[] args) {
//        String roy="roy老师$";
//        String will="will老师";
//        String tufei="土匪老师";
//        String youmi="悠米老师";
//        String kaka="kk.老师$";
//        System.out.println(roy);
//
//        //.表示任意一个字符，可以是中文
//        String regular="^..\\.老师\\$";
//        //输出的时候依然代表一个普通的字符，但是当使用regex进行调用的时候，$就变成了结束符
//        System.out.println(regular);
//        //\\w表示的是0-9A-Za-z
//        //加上两根斜杠转义$ 从结束符变成普通的$符号。
//        String wordReg="^\\w\\w\\w老师\\$";
//        //验证是否符合正则表达式的规则
//        System.out.println(roy.matches(regular));
//        System.out.println(kaka.matches(wordReg));


        //量词： 用{次数}表示  {次数，次数}表示范围  { 次数，}表示大于等于次数
        String roy="roy老师";
        String ro="royroy老师";
        String royy="roywill老师";
        String will="will老师";
        String tufei="土匪老师";
        String youmi="土土老师";
        String kaka="kk.老师";
        String teacher="老师";

//        //表示 名字大于等于两个字的老师
//        String reg=".{0,4}老师";
//        System.out.println(will.matches(reg));

        //元字符组，用[]括起来，从指定的范围中选择1个字符，只匹配1个字符。
        //老师前面有3个字符，这3个字符是rwioyl中的任意一个。
//        String regw="[rwioyl]*老师";
//        System.out.println(teacher.matches(regw));

        //词组： 用()括起来，表示括起来的内容作为一个整体出现，必须顺序一致，而且匹配整体字符的数量。
        //如果需要指定词组可以在多个词组中选择，用（词组A|词组B）表示或。
        String regex="(roy|will|土匪){0,3}老师";
        System.out.println(youmi.matches(regex));


        String mobileReg="1[3-9]\\d{9}";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("请输入电话号码：");
            String s = sc.nextLine();
            if(s.matches(mobileReg)){
                System.out.println("输入的是一个手机号");
            }
            else{
                System.out.println(
                        "输入的不是一个手机号"
                );
            }
        }




    }


}
