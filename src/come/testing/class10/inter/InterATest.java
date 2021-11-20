package come.testing.class10.inter;

/**
 * @Classname InterATest
 * @Description 类型说明
 * @Date 2021/8/26 22:59
 * @Created by 特斯汀Roy
 */
public class InterATest {
    public static void main(String[] args) {
        ICat cat=new ICat();
        //有默认实现的方法
        cat.death();
        //实现了接口中的抽象方法
        cat.move();
        //新增的方法
        cat.eat();

        IDog dog=new IDog();
        dog.move();
        dog.eat();


    }

}
