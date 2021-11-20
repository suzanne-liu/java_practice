package come.testing.class10.inter;

/**
 * @Classname IAnimal
 * @Description 类型说明
 * @Date 2021/8/26 22:49
 * @Created by 特斯汀Roy
 */
public interface IAnimal {

    //接口中的变量都是常量,可以省略final 和 static。
    int AGE=0;

    //接口中的方法默认就是public abstract的。
    //所以必然需要被实现。
     void move();

     void eat();

     //有默认方法体实现的方法。
     default void death(){
         System.out.println("动物都会死");
     }

}
