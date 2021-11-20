package come.testing.class2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        String a = "一斤包子";  //字符串声明与赋值
        int b;

        //以下三行，获取用户输入信息
        Scanner Shuru = new Scanner(System.in);
        System.out.println("路上有西瓜吗？有请输入1，没有输入0。请输入：");
        b = Shuru.nextInt();
        if(b==1){
            System.out.println("将带回："+a+"和一个西瓜");
        }else {
            System.out.println("将带回："+a);
        }
    }
}

