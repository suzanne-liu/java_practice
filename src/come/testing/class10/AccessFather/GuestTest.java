package come.testing.class10.AccessFather;

/**
 * @Classname GuestTest
 * @Description 类型说明
 * @Date 2021/8/26 23:25
 * @Created by 特斯汀Roy
 */
public class GuestTest {
    public static void main(String[] args) {
        //子类能够继承父类的除了private以外的方法。
        Son son=new Son();
        son.giveCaili();

        //同一个包中的其他类，即使是自己的对象，也不能使用private方法。
        Father roy=new Father();
//        roy.changName();




    }

}
