package come.testing.class10;

/**
 * @Classname Cat
 * @Description 类型说明
 * @Date 2021/8/26 21:59
 * @Created by 特斯汀Roy
 */
public class Cat extends Mammal{
    public Cat(){
        System.out.println("一只可爱的小猫咪出生了");
    }

    public String kind="猫";

    public void eat(){
        System.out.println("猫咪喜欢吃鱼");
    }

    public void welcome(){
        System.out.println("死鬼怎么现在才回来");
    }

}
