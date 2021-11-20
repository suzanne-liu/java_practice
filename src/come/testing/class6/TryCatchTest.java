package come.testing.class6;

import java.util.Scanner;

/**
 * @Classname TryCatchTest
 * @Description 类型说明
 * @Date 2021/8/17 20:57
 * @Created by 特斯汀Roy
 */
public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        String nL = sc.nextLine();
        try{
            int i = Integer.parseInt(nL);  //将字符串nl,使用Integer中的parseInt方法，变成整数
            System.out.println("我三年后"+(i+3)+"岁");
        } catch(Exception e){
            System.out.println("你输入的不是一个整数");
        }


    }


}
