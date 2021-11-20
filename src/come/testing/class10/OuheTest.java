package come.testing.class10;

/**
 * @Classname OuheTest
 * @Description 类型说明
 * @Date 2021/8/26 22:36
 * @Created by 特斯汀Roy
 */
public class OuheTest {
    public static void main(String[] args) {
        //修改的时候容易产生问题。
        Dog d=new Dog();
        d.move();

        Cat c=new Cat();
        c.move();

    }
}
