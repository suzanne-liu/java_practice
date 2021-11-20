package come.testing.class6;

import come.testing.class4.WashMachine;

import java.util.Arrays;

/**
 * @Classname StringTest
 * @Description 类型说明
 * @Date 2021/8/17 20:13
 * @Created by 特斯汀Roy
 */
public class StringConvertTest {
    public static void main(String[] args) throws NumberFormatException {
//        String hello="hello world";
//        int a=3;
//        String sa = String.valueOf(a);
//        System.out.println("a的值是"+a);
//        System.out.println(a+"");
//
//        String s=a+"a的值";
//
//        //99乘法表存储为二维数组。
//        String[][] cfb=new String[9][9];
//        for(int hang=1;hang<=cfb.length;hang++){
//            for(int lie=1;lie<=cfb[hang-1].length;lie++){
//                //将int转为，字符串并完成字符串的转换拼接
//                String exp=hang+"x"+lie+"="+hang*lie;
//                cfb[hang-1][lie-1]=exp;
//            }
//        }
//        System.out.println(Arrays.deepToString(cfb));
//
//        WashMachine ws=new WashMachine();
//        //类类型的对象转换为字符串，使用的是Object中的toString方法。
//        //也可以用+"" ,但是不建议
//        String wstr = ws.toString();
//        System.out.println(ws);


        String si="15";
        System.out.println(si + 3);

        //基本数据类型，是没有方法和属性的
        int i = Integer.parseInt(si);
        //包装类型才有方法和属性。
        Integer it=i;
        it.toString();
        System.out.println(it);

        String sf="15.6";
        Float v = Float.parseFloat(sf);
        System.out.println(v);

        //类型转换中如果类型不匹配，会出现异常
        String s="我今天15岁";
//        try {
        int i1 = Integer.parseInt(s);
//        } catch (NumberFormatException exception) {
//            //调用异常对象的方法，输出堆栈跟踪信息，也就是异常信息。
//            exception.printStackTrace();
//        }
        System.out.println("代码执行完了");
        //sleep方法必须处理异常才能调用，所以，可以用try catch 或者 直接在上层方法 throws 抛出。
//        Thread.sleep(1000);
    }


}
