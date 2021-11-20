package come.testing.class6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname StringOps
 * @Description 类型说明
 * @Date 2021/8/17 21:56
 * @Created by 特斯汀Roy
 */
public class StringOps {
    public static void main(String[] args) {
        String str="1234asd";
        String str2=new String("roy");
        //用类名. 了解类的静态变量和方法。
        String.valueOf('a');

        //用对象. 了解实例方法。
        String s="我今天150岁";
        System.out.println("请输入n年后：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //将我今天15岁变成   我n 年后 15 +n 岁
        //1、取出15这个数字
        //方法一：
        String age=s.substring(3,5);
        System.out.println(age);
        //方法二：基于天，分割，然后再把岁割掉。
        String spAge = s.split("天")[1].split("岁")[0];
        System.out.println(spAge);

        int i = Integer.parseInt(age);
        int resultAge=i+n;
        int resultAge2=Integer.parseInt(spAge)+n;

        //替换岁数
        String result1 = s.replace(age, resultAge + "").replace("今天",n+"年后");
        System.out.println(result1);
        String result2 = s.replace(spAge, resultAge2 + "").replace("今天",n+"年后");
        System.out.println(result2);


//        //equals判相等，建议"常量".equals(变量)
//        "我18岁".equals(s);
//        System.out.println("是否包含："+s.contains("15岁"));
//        System.out.println("长度是："+s.length());
//        System.out.println("下标为2的位置的字符是："+s.charAt(2));
//        //注意replace会产生一个新的字符串，而不会改变原字符串的内容。
//        s=s.replace('我','你');
//        System.out.println(s);
//        s=s.replace("你","roy");
//        System.out.println(s);
//        //replaceAll支持正则表达式。
//        s=s.replaceAll("roy","will");
//        System.out.println(s);
//        //substring 是左闭右开的，也就是起点下标的字符保留
//        String substring = s.substring(3);
//        System.out.println(substring);
//
//        String substring2=s.substring(4,s.length());
//        System.out.println(substring2);
//
//        //将字符串按指定分隔符切分为字符串数组
//        String[] split = s.split("1");
//        System.out.println(Arrays.toString(split));
//
//        System.out.println("岁在第几位？："+s.indexOf("岁"));
//
//        //转换小写
//        String s1 = "ABSCSD".toLowerCase();
//        System.out.println(s1);



    }


}
