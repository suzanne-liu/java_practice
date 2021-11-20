package come.testing.class10.inter;

/**
 * @Classname IDog
 * @Description 类型说明
 * @Date 2021/8/26 23:01
 * @Created by 特斯汀Roy
 */
public class IDog implements IAnimal{
    @Override
    public void move() {
        System.out.println("狗子看见肉就疯跑");
    }

    @Override
    public void eat() {
        System.out.println("狗狗喜欢吃骨头");
    }

    @Override
    public void death() {
        System.out.println("狗狗可以活十多岁");
    }
}
