package come.testing.class7;

public class homwork7 {
    public static void main(String[] args) {
        //StringBuilder 是一个预先已经定义好的类
        //实现字符串反转
        //方法一：使用已有的方法
        System.out.println("----------  方法一  ----------");
        StringBuilder ss = new StringBuilder("AFDjjjkkd"); //实例化
        System.out.println("反转之前："+ss);
        ss.reverse();
        System.out.println("反转之后："+ss);

        //方法二：利用 String 的 toCharArray 方法先将字符串转化为 char 类型数组，然后将各个字符进行重新拼接
        System.out.println("----------  方法二  ----------");
        String S2="sfggQFR123";
        System.out.println("反转之前："+S2);
        char[] S22 = S2.toCharArray();   //先将字符串转化为 char 类型数组
        System.out.println(S22);   //char 类型数组输出时是自动转成字符串输出的
        String S_reverse = "";   //空字符串
        for (int i = S22.length - 1; i >= 0; i--) {
            S_reverse += S22[i];   //从数组最后一个开始读取，拼接
        }
        System.out.println("反转之后："+S_reverse);

        //方法三：利用 String 的 CharAt 方法取出字符串中的各个字符
        System.out.println("----------  方法三  ----------");
        String S3="sfggQFR123";
        System.out.println("反转之前："+S3);
        String Y_reverse = "";
        int length = S3.length();
        for (int i = 0; i < length; i++) {
            Y_reverse = S3.charAt(i) + Y_reverse;
        }
        System.out.println("反转之后："+Y_reverse);

    }
}
