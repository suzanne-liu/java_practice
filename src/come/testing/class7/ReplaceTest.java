package come.testing.class7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname ReplaceTest
 * @Description 类型说明
 * @Date 2021/8/20 20:54
 * @Created by 特斯汀Roy
 */
public class ReplaceTest {

    public static void main(String[] args) {
        //替换45678为X
        String s="[1, 2, 3, 5, 4, 6, 9, 7, 8, 0]";
//        for(int i=4;i<=8;i++){
//            s=s.replace(String.valueOf(i),"X");
//        }
//        System.out.println(s);

        String result = s.replaceAll("[3579]", "X");
        System.out.println(result);

        String[] split = s.split("[\\[,\\]]");
        for(int i=1;i<split.length;i++){
            System.out.println(split[i].trim());
        }

//        System.out.println(Arrays.toString(split));


    }

}
