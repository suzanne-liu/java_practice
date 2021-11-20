package come.testing.class4;

import java.util.Scanner;

public class Dog {
    //定义一些好狗的属性（狗狗该有容貌焦虑了）
    //有四条腿，两只耳朵，1条尾巴
    public int legNum=4;
    public int earNum=2;
    public int tailNum=1;
    public String eye="大眼睛";
    //好狗的性格定义可能经常会被改变，这样可能会被频繁改动的，可以使用静态变量
    public static String xingge="温柔";
    //不能被改变的属性
    public static final String LIFE="活";
    public static final String KIND="狗";

    //方法用于描述这个类的功能和特点
    //Dog可以长大，拥有叫的方法，小狗呜呜叫，大狗汪汪叫，老狗嗷嗷叫。
    //通过创建实例的dog对象，让狗子长大到一定阶段并且叫一次
    //定义狗叫的声音：根据年龄区分
    public String jiaosheng(int dogAge){
        String result="";
        switch (dogAge){
            case 0:
            case 1:
            case 2:
                result="嗷呜，呜呜呜～";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                result="汪汪汪～";
                break;
            default:
                result="嗷嗷嗷嗷～";
                break;
        }
        return result;
    }
    //小狗长大的方法
    public static int growUp(int age,int growNum){
     //   System.out.println("你的狗狗原来是 "+age+" 岁，几年过去了？请输入");
      //  Scanner Doggrow=new Scanner(System.in);
       // int growNum=Doggrow.nextInt();
        age+=growNum;
        return age;
    }
    public static float growUp(float age,float growNum){
        age+=growNum;
        return age;
    }
    public static double growUp(double age,double growNum){
        age+=growNum;
        return age;
    }

}
