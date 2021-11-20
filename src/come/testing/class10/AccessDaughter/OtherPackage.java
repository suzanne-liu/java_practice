package come.testing.class10.AccessDaughter;

import come.testing.class10.AccessFather.Father;

/**
 * @Classname OtherPackage
 * @Description 类型说明
 * @Date 2021/8/26 23:32
 * @Created by 特斯汀Roy
 */
public class OtherPackage {
    public static void main(String[] args) {
        //在其他包中，只能使用public级别的方法。
        Father father=new Father();
        father.speak();

        DaughterInLaw daughter=new DaughterInLaw();
        //不同包中的子类对象（不在子类中不能调用子类对象）
//        daughter.giveCaili();
    }

}
