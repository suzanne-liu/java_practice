package come.testing.class6;

import come.testing.class4.PrimeHalf;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname MainTest
 * @Description 类型说明
 * @Date 2021/8/17 21:22
 * @Created by 特斯汀Roy
 */
public class MainTest {
    public static void main(String[] args) {
//        //main方法的输入参数其实就是一个数组;
//        PrimeHalf.main(new String[3]);
//        //null可以认为是任意的类型
//        PrimeHalf.main(null);
//        StringargsTest.main(new String[3]);
//        //未定义的对象是个null，空指针，没有地址。
//        String[] strings=new String[3];
//        //不会报空指针异常
//        "null".equals(strings[0]);
//        //报空指针异常，只有null调用方法和属性的时候，才会出现空指针。
//        strings[0].equals("null");
//        System.out.println(Arrays.toString(strings));
//
//        StringargsTest.main(new String[]{"4","b"});
////        StringargsTest.main(3);

        //写一个main方法，通过其参数列表String[] args输入两个参数，转为int型，然后比较大小，输出比较的结果。（使用try catch捕获异常，并且输入时，设计错误的非数字输入）
        //用 run configurations 设置参数运行和打包为jar包通过命令执行两种方式。
        System.out.println(Arrays.toString(args));
    }
}
