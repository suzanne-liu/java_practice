package come.testing.class5;

import come.testing.class4.WashMachine;

import java.util.Arrays;

/**
 * @Classname ArrayTest
 * @Description 类型说明
 * @Date 2021/8/14 20:06
 * @Created by 特斯汀Roy
 */
public class ArrayTest {
    public static void main(String[] args) {
        //创建一个数组，里面可以存放5个元素
        String[] strArray=new String[5];
        //创建数组的同时给定初值,在内存中分配一块可以存储3个字符串的空间。
        String[] initStrs={"roy","肉一","胖嘟嘟"};
        //定义一个长度为0的数组。
        String[] initStrArrs=new String[]{};


        //增
        //删  数组中不支持增和删的操作，数组在定义的时候，长度就是固定的。

        //改，其实就是对数组中的元素来进行修改赋值
        initStrs[1] ="肉老师";

        //查
        System.out.println(strArray[4]);
        System.out.println(initStrs[0]);
        System.out.println(initStrs[1]);

        //Arrays类对于数组的操作
        //fill操作完成对于数组中所有元素的赋值
        Arrays.fill(strArray,"roy");

        System.out.println(Arrays.toString(strArray));


        //遍历数组
        //按照下标从第1个遍历到最后一个
        for(int index=0;index<strArray.length;index+=2){
            System.out.println(strArray[index]);
        }

        //增强型的for循环，foreach循环，遍历数据结构中的每一个元素
        for (String str : initStrs) {
            System.out.println(str);
        }

        System.out.println(initStrs);



        WashMachine washMachine=new WashMachine();
        //输出的内容实际上是调用了 Object类中的toString方法，将类型的名字和引用地址（hashcode）拼接到一起
        System.out.println(washMachine.toString());

        //数组也可以是类型的数组
        WashMachine[] wms=new WashMachine[4];
        WashMachine[] wms1=new WashMachine[]{new WashMachine(),new WashMachine()};

    }
}
