package come.testing.class6;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class homework6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if (args.length != 2){
            System.out.println("输入不合要求，请输入两个数");
            return;
        };

        try {
            int a = Integer.parseInt(args[0]);
            System.out.println(a);
            int b = Integer.parseInt(args[1]);
            System.out.println(b);
            if(a>b){
                System.out.println("这里有两个数："+a+"和"+b+",较大的一个数是"+a);
            }else {
                System.out.println("这里有两个数："+a+"和"+b+",较大的一个数是"+b);
            }
        }catch (Exception e){
            System.out.println("输入的不是数字");
        };

//        //字符串常用操作
//        String c = "afsdjn123";
//        String d = "FSDFFH245GDG";
//        //        字符串的拼接：+
//        System.out.println(c+d);
//        //        获取字符串的长度：string.length()
//        System.out.println(c.length());
//        //        替换字符串中的内容：string.replace()
//        System.out.println("c 是："+c);
//        System.out.println("替换后："+c.replace("a","哈"));
//        //        获取子串：string.substring()
//        System.out.println(c.substring(2,c.length()-1));
//        //        判断操作（返回为boolean结果）
//        //        相等：string.equals()
//        System.out.println("是否相等？ "+"aaa".equals(c));
//        System.out.println("是否相等？ "+"afsdjn123".equals(c));
//        //        包含：string.contains()
//        System.out.println("c是否包含a? "+c.contains("a"));
//        System.out.println("c是否包含o? "+c.contains("o"));
//
//        //        字符串以某内容开头：string.startsWith()
//        System.out.println("c是否是以a开始？ "+ c.startsWith("a"));
//        //        字符串以某内容结尾：string.endsWith()
//        System.out.println("c是否是以f结束？ "+ c.endsWith("f"));



    }
}
