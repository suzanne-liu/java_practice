package come.testing.class1;

public class Homework {
    public static void main(String[] args) {
        int a=2;
        long b=342222444;
        float c=4.23f;
        double d=1.333;
        System.out.println("以最高精度输出 a+b/c+d = "+(a+b/c+d));
        System.out.println("强制转化为int输出 a+b/c+d = "+(int)(a+b/c+d));
        System.out.println("以最高精度输出 (a+b)%c+5-d) = "+((a+b)%c+5-d));
        System.out.println("强制转化为int输出 (a+b)%c+5-d = "+(int)((a+b)%c+5-d));
        System.out.println("以最高精度输出 a+b%c*d) = "+(a+b%c*d));
        System.out.println("强制转化为int输出 a+b%c*d = "+(int)(a+b%c*d));
    }
}
