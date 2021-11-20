package come.testing.class10.AccessDaughter;

import come.testing.class10.AccessFather.Father;

/**
 * @Classname DaughterInLaw
 * @Description 在不同包中的子类。
 * @Date 2021/8/26 23:33
 * @Created by 特斯汀Roy
 */
public class DaughterInLaw extends Father {


    public static void main(String[] args) {
        DaughterInLaw daughter=new DaughterInLaw();
        //不在同一个包中的子类中，子类对象可以调用protected方法。
        daughter.giveCaili();

        //即使是父类对象，也没有办法使用自己的protected方法。
        Father roy=new Father();
//        roy.giveCaili();
    }
}
