package come.testing.class7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname StringConvert
 * @Description 类型说明
 * @Date 2021/8/20 20:07
 * @Created by 特斯汀Roy
 */
public class StringConvert {
    public static void main(String[] args) {
//        String s = "roy老师帅";
//        System.out.println("转换前："+s);
//        convert(s);
//        String result=s.replace("老师","帅哥");
//        System.out.println(s);
//        System.out.println(result);

//        StringBuffer stringBuffer=new StringBuffer(s);
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);

//
//        StringBuilder stringBuilder=new StringBuilder(stringBuffer);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);

    }

    /**
     * 输入字符串，返回反转之后的结果
     * @param s
     * @return
     */
    private static String convert(String s) {
        //                  转反串符字试测
        //             转反串字试测
        //          测试字串反转
        //进行交换的字符： 7位  0 和 6  1和5  2和4  3不动
        //6位：0和5 1和4 2和3
        //交换规则： 从0开始到中位数-1的下标a 分别和 长度-1-a进行交换
        //str[length-1-a] 和str[a]进行交换 a的范围是0到length/2
        //基于中间的位置字符，对两边的字符进行交换。
        //奇数位数：7位字符串 中位数是  7/2=3  中间的字符就是3的下标。  字符串长度/2
        //偶数位数：假设中间有个空的字符  6/2=3
        //获取长度
        int length = s.length();
        //中间位置
        int mid = length / 2;
        //把字符串转成字符数组
        char[] chars = s.toCharArray();
        //str[length-1-a] 和str[a]进行交换 a的范围是0到length/2
        for (int a = 0; a < mid; a++) {
            //交换？
            char tmp=chars[a];
            chars[a]=chars[length-1-a];
            chars[length-1-a]=tmp;
        }
        System.out.println(Arrays.toString(chars));
        //把字符数组转成字符串
        String s1 = new String(chars);
        System.out.println("转换后："+s1);
        return  s1;
    }
}
