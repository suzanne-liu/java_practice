package come.testing.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework9_4 {
    //1、使用数组，输出斐波那契数列前N项结果
    //2、使用递归算法，计算斐波那契数列第n项的值
    public static void main(String[] args) {
        System.out.println("请输入斐波那契数列级数");
        Scanner jishu = new Scanner(System.in);
        int n = jishu.nextInt();
       // System.out.println(fib2(8));
        List<Integer> list= new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            System.out.println("第"+i+"个，值为"+fib2(i));
            list.add(fib2(i));
        }
        System.out.println("现在list数组中："+list);

    }

    public static int fib2(int n){
        int result=0;
        if((n==1)||(n==2)){
            return 1;
        }else {
            result=fib2(n-1)+fib2(n-2);
            return result;
        }
    }


}
