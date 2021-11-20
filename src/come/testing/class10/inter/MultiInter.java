package come.testing.class10.inter;

/**
 * @Classname MultiInter
 * @Description 类型说明
 * @Date 2021/8/26 23:03
 * @Created by 特斯汀Roy
 */
public class MultiInter {
    public static void main(String[] args) {
        //接口的实例化需要用实现接口的类来完成，否则就要写匿名类。
        IAnimal aa=new IAnimal() {
            @Override
            public void move() {

            }

            @Override
            public void eat() {

            }
        };
        //接口的多态
        //接口由于只定义了方法，没有实现，所以修改的时候，不容易因为耦合性而产生问题。
        IAnimal ac=new ICat();
        IAnimal ad=new IDog();
        ac.eat();
        ad.eat();


    }
}
