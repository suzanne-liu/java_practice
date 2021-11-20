package come.testing.class6;

import come.testing.class4.PrimeHalf;

/**
 * @Classname StringargsTest
 * @Description 类型说明
 * @Date 2021/8/17 21:19
 * @Created by 特斯汀Roy
 */
public class StringargsTest {

    public static void main(String[] args) {
        //args就是一个字符串数组
        if(args.length<1){
            System.out.println("参数数量不足");
        }
        else{
            //如果没有if else的判断，直接使用args[0]那么会导致数组下标越界的异常。
            //main方法实际调用的时候给的就是个空数组不是null。
            String arg = args[0];
            try {
                //这也是一个局部变量。
                int i = Integer.parseInt(arg);
                System.out.println("输入的数是整数，值是"+i);
            } catch (NumberFormatException exception) {
                System.out.println("输入的数不是整数");
            }
        }



    }



}
