package come.testing.class10;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * @Classname AbTest
 * @Description 类型说明
 * @Date 2021/8/26 22:42
 * @Created by 特斯汀Roy
 */
public class AbTest {

    public static void main(String[] args) {
        //抽象类的对象必须由继承抽象类的子类来完成实例化
        AbstractList<String> ab=new ArrayList<>();
        // 否则就需要现场实现一个子类，进行实例化，这个子类的写法叫做匿名类，因为没有类名。
        AbstractList<String > s=new AbstractList<String>() {
            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };



    }
}
