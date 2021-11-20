package come.testing.class10;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ExtendsTest
 * @Description 类型说明
 * @Date 2021/8/26 20:52
 * @Created by 特斯汀Roy
 */
public class ExtendsTest {
    public static void main(String[] args) {
        //其实JSONobject类用的parseObject方法是继承自JSON的。
        JSONObject  object= JSON.parseObject("");
        JSONObject.parseObject("");

        List<String> list=new ArrayList<>();
        list.add("roy");
        list.add("wiil");
        System.out.println(list.toString());

        Mammal a=new Mammal();
        a.move();
        System.out.println("------------Mammal类重写的方法和重新定义的变量-----------");
        System.out.println(a.kind);
        a.eat();
        //Animal重写了Object中的toString方法，mammal继承的是animal已经重写的方法
        System.out.println(a.toString());
        System.out.println("--------------Mammal类扩展的方法和属性-----------");
        a.giveBirth();
        System.out.println(a.eyes);

//        Bird b=new Bird();
//        System.out.println(b.age);
//        b.eat();

        Animal b=new Mammal();


    }

}
