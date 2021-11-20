package come.testing.class1;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("HelloJava");

        byte ba = 127;
        System.out.println("byte类型："+ba);
        System.out.println("byte类型+1："+(byte)(ba+1));

        short sa=32767;
        System.out.println("short类型,没有强制转化，会按int处理："+(sa+123));
        System.out.println("short类型,强制转化，会按字节处理，结果会在范围之内："+(short)(sa+123));

        int ia=2147483647;
        System.out.println("超出int,变成负数："+(ia+1));

        float fnum=3.14159265f;
        System.out.println("浮点型,超出位数按随机截取处理："+fnum);

        double dnum=3.14159265;
        System.out.println("double类型比较长，在范围内，不会被自动截取："+dnum);

        char c='君';
        System.out.println("输出原始的字符："+c);
        System.out.println("字符转成int输出："+(int)c);
        System.out.println("数字转成字符输出："+(char)(21531));

        String schar="suzanne";
        System.out.println("字符串输出："+schar);

        boolean isA=true;
        boolean notA=false;
        System.out.println("布尔值true："+isA);
        System.out.println("布尔值false："+notA);
    }
}