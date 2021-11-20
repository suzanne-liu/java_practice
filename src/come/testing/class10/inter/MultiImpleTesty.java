package come.testing.class10.inter;

/**
 * @Classname MultiImpleTesty
 * @Description 类型说明
 * @Date 2021/8/26 23:11
 * @Created by 特斯汀Roy
 */
public class MultiImpleTesty {

    public static void main(String[] args) {
        //向上转型之后，隐藏接口中不存在的方法。
        IPet p=new ICat();
//        p.move();
        //实现多个接口的类，可以调用各个接口的方法。
        ICat cat=new ICat();
        cat.move();
        cat.cute();




    }


}
