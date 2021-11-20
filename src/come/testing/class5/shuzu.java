package come.testing.class5;

import java.sql.Array;
import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
       //定义数组,定义好长度
        int[] intarray=new int[6];

       //遍历数组内每个元素，并赋值
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = i;
        }

        //数组无法直接输出，直接输出是信息，需要使用tostring输出
        System.out.println(intarray);
        System.out.println(Arrays.toString(intarray));

        //遍历输出数组中的每个元素
        for (int i : intarray) {
            System.out.println(intarray[i]);
        }

    }
}
