package come.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listtest {
    public static void main(String[] args) {
        //建
        List<String> list = new ArrayList<>();
        //List<Integer> list=new ArrayList<>();
        System.out.println(list);

        //增
        list.add("77");
        list.add("1314");
        list.add("520");
        list.add("68");
        list.add("88");
        list.add("1314");
        System.out.println(list);

        //改
        list.set(1,"a");
        System.out.println(list);

        //查
        System.out.println(list.get(3));

        //删
        list.remove("1314");
        System.out.println(list);

        //遍历
        System.out.println("------------foreach循环---------------");

        for(String SS:list){
            System.out.println(SS);
        }

        System.out.println("------------iterator遍历---------------");
        //hasNext()看是否有下一个，next()取下一个
        Iterator<String> iteratorYY = list.iterator();
        while(iteratorYY.hasNext()){
            System.out.println(iteratorYY.next());
        }


    }
}
