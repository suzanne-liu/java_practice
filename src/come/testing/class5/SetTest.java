package come.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Classname SetTest
 * @Description 类型说明
 * @Date 2021/8/14 21:14
 * @Created by 特斯汀Roy
 */
public class SetTest {

    public static void main(String[] args) {
        //指定set中存储的元素类型。
        //set是无序存储的，没有下标。
        //set中不允许有重复的元素。会自动完成去重操作。
        Set<String> royset=new HashSet();

        //增
        royset.add("roy");
        royset.add("摔");
        royset.add("will");
        royset.add("土匪");
        royset.add("土匪");
        //set中定义好了数据类型之后，只能存储指定类型的数据。
//        royset.add(1);
        //set可以直接用sout进行输出，输出其中的元素内容。而不是类型@引用地址。
        System.out.println(royset.toString());

        //删
        royset.remove("roy");
        royset.remove("卡卡");
        System.out.println(royset);

        //改？ set没有顺序，所以没有办法找到某个值来进行修改。
        //如果要实现改的现象，就remove一个，然后add一个
        royset.remove("摔");
        royset.add("帅");
        System.out.println(royset);

        //查
        //遍历元素： set没有下标所以不能通过下标来进行遍历。
        for (String s : royset) {
            System.out.println(s+"老师");
        }

        System.out.println("----------------使用iterator遍历-----------------");
        //iterator迭代器遍历。
        //iterator也是指定了类型的，跟随set集合类型一样。
        Iterator<String> iterator = royset.iterator();
        //判断set中有下一个元素
        while(iterator.hasNext()){
            //拿下一个元素出来
            String next = iterator.next();
            System.out.println(next);
            //在一次判断中调用了两个next，所以会出现nosuchElement的异常。
//            System.out.println(iterator.next()+"的名字是"+iterator.next());
            System.out.println(next+"的名字是"+next);
        }




    }

}
