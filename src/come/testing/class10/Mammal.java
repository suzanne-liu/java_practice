package come.testing.class10;


/**
 * @Classname Mammal
 * @Description 哺乳动物
 * @Date 2021/8/26 21:03
 * @Created by 特斯汀Roy
 */
public class Mammal extends Animal {

    public String kind="哺乳动物";

    public String eyes="眼睛";
    //因为父类Animal没有无参构造方法，所以需要显式调用一下父类的构造方法
    public Mammal(){
        super("哺乳");
        System.out.println("子类的构造方法产生了一个哺乳动物");
    }

    public void giveBirth(){
        System.out.println("哺乳动物都能生宝宝");
    }

    public void eat(){
        System.out.println("哺乳动物有的吃草，有的吃肉");
    }

//    //重写的时候，返回类型必须和父类一致。
//    public String move(){
//        return "";
//    }

    //重写的时候，要求参数列表必须和父类方法一致。 如果参数列表不同，相当于重载了一个方法。
    public void move(String speed){
        System.out.println("哺乳动物以"+speed+"行进");
    }



}
