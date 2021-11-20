package come.testing.class4;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        //实例化一条狗
        Dog xiaomei;
        xiaomei = new Dog();
        //除了，类中通用的属性，这条狗还有另外一些独有的特点
        String dogname = "小美";
        String pinzhong = "金毛";
        //文本编辑
        System.out.println("我有一只" + pinzhong + xiaomei.KIND + "，它的名字叫" + dogname);
        System.out.println("它有" + xiaomei.earNum + "只耳朵，" + xiaomei.legNum + "条腿，" + xiaomei.tailNum + "条尾巴");
        System.out.println("它有以下特点：" + xiaomei.eye + " " + xiaomei.xingge);

        System.out.println("\n" + "你的狗狗，今年几岁？请输入数字");
        Scanner age = new Scanner(System.in);
        int xiao_age = age.nextInt();
        System.out.println("这里有一个神奇的盒子，你只要输入年数，就可以听到你狗狗在未来的声音。请输入数字");
        Scanner grow = new Scanner(System.in);
        int xiao_grow = grow.nextInt();

        //调用计算年龄的方法
        System.out.println(xiaomei.jiaosheng(xiaomei.growUp(xiao_age, xiao_grow)));
        int i = 0;
        for(; ; ) {
            System.out.println("还想再来一次吗？再来请扣1");
            Scanner a = new Scanner(System.in);
            i = a.nextInt();
            if (i == 1) {
                System.out.println("\n" + "你的狗狗，今年几岁？请输入数字");
                age = new Scanner(System.in);
                xiao_age = age.nextInt();
                System.out.println("这里有一个神奇的盒子，你只要输入年数，就可以听到你狗狗在未来的声音。请输入数字");
                grow = new Scanner(System.in);
                xiao_grow = grow.nextInt();

                //调用计算年龄的方法
                System.out.println(xiaomei.jiaosheng(xiaomei.growUp(xiao_age, xiao_grow)));
            } else {
                System.out.println("游戏结束！");
                break;
            }

        }
    }
}
