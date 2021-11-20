package come.testing.class10;

/**
 * @Classname MultiTest
 * @Description 类型说明
 * @Date 2021/8/26 22:00
 * @Created by 特斯汀Roy
 */
public class MultiTest {


    public static void main(String[] args) {
        //父类(爷爷类)引用指向子类对象，又叫做向上转型
        Animal acat= new Cat();
        System.out.println("acat的类型是"+ acat.kind);
        Animal adog=new Dog();
        System.out.println("adog的类型是"+adog.kind);
        //多态的体现，同样的都是动物，但是调用相同的方法，产生了不同的形态。
        acat.eat();
        adog.eat();

        //调用没有重写的方法
        acat.move();
        adog.move();
        System.out.println("-----------------测试向下转型---------------");
        //向上转型之后的对象，会隐藏自己的新增方法、变量，以及修改覆盖的变量。
        //向下转型： 通过向上转型产生的对象才能向下转型为原本的子类。
        //向下转型之后，就可以使用新增的方法和变量。
        System.out.println("acat向下转型之后的类型是"+((Cat) acat).kind);
        //向下转型的对象，可以调用自己的方法。
        Cat happy= (Cat) acat;
        happy.welcome();
        //执行前不会报错，因为编译器运行之前，不知道acat是一个猫，而不是狗
        //执行之后才会报错。
//        ((Dog) acat).welcome();

        //多态的意义：
        //当方法进行调用的时候，不需要关注它的具体实现是什么类，只要是满足条件的子类就可以。
        Feeder roy=new Feeder();
        //当roy去投食的时候，不需要管喂的是猫还是狗
        roy.feedMaster(acat);
        roy.feedMaster(adog);


    }



}
