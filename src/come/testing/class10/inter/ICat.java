package come.testing.class10.inter;

/**
 * @Classname ICat
 * @Description 类型说明
 * @Date 2021/8/26 22:56
 * @Created by 特斯汀Roy
 */
//实现接口的类，必须实现接口中除default以外的方法
public class ICat implements IAnimal,IPet{


    @Override
    public void move() {
        System.out.println("猫咪只会睡觉");
    }

    public void eat(){
        System.out.println("猫咪喜欢吃猫粮");
    }

    @Override
    public void cute() {
        System.out.println("猫咪可会卖萌了");
    }
}
