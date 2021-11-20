package come.testing.class2;

/**
 * @Classname BitMath
 * @Description 类型说明
 * @Date 2021/8/7 20:44
 * @Created by 特斯汀Roy
 */
public class BitMath {
    public static void main(String[] args) {
        byte a=37;
        char ca=(char)a;
        System.out.println("ca:"+ca);
        byte b=-99;
        char cb=(char)b;
        System.out.println("cb:"+cb);
        byte aAndb = (byte)(a & b);
        System.out.println("a & b :"+aAndb);
        //与运算用于进行布尔值（表达式）的运算。
        boolean b1 = true & false;
        System.out.println("b1:"+b1);
        boolean b2=true && false;
        System.out.println("b2:"+b2);
        byte aorb =(byte)(a | b);
        System.out.println("(a | b):"+aorb);
        //或运算进行布尔表达式的运算。
        boolean b3 =(a>10)|(b<10);
        System.out.println("b3:"+b3);
        //异或
        byte aXorb=(byte) (a^b);
        System.out.println("aXorb:"+(char)aXorb);
        //异或特征：结果和其中一个数再做异或，得到另一个数。
        int i = a ^ aXorb;
        System.out.println("a和aXorb结果异或的结果："+i);
        int i2 = b ^ aXorb;
        System.out.println("b和aXorb结果异或的结果："+i2);
        //按位取反
        System.out.println(~b);
        System.out.println(~a);

//        位移
//        左位移  操作数<< 移动位数
        a= (byte) (a<<1);
        b= (byte) (b<<1);

        System.out.println( a);
        System.out.println(b);

        //位移移动32位的时候，就会复原。
        System.out.println("左移："+(64<<2));

//        右位移  >> 会保留符号位进行位移操作 每次相当于除以2，负数移着就变成了-1
//        移动32位就会还原。
        System.out.println("右移："+(b>>32+3));


    }
}
