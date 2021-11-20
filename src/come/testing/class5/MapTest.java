package come.testing.class5;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //实例化Map
        //map中不能有重复的键。因为是用set来进行存储。
        Map<String,Integer> scoreMap=new HashMap<>();
        //增
        scoreMap.put("roy",90);
        scoreMap.put("will",90);
        scoreMap.put("土匪",96);
        scoreMap.put("卡卡",99);
        //不能有重复的键，所以put相同的键相当于修改
//        scoreMap.put("土匪",36);

        //删
        //基于键进行移除
        scoreMap.remove("roy");
        //基于键值对进行移除，限制更高
        scoreMap.remove("will",95);
//        //清空
//        scoreMap.clear();

        //改
        //写两个值参数，那么会校验值是否正确再修改
        scoreMap.replace("will",90,92);
        //直接修改键的值。
        scoreMap.replace("will",99);

        //查
        //map的遍历方式，基于键或者键值对的存储来做。
        //获取键的集合
        Set<String> stringSet = scoreMap.keySet();
        System.out.println("键的集合："+stringSet);


        System.out.println("---------------基于keyset进行遍历------------------");
        //基于keyset进行遍历
        for (String key : stringSet) {
            //通过get方法获取键的值
            System.out.println(key+scoreMap.get(key));
        }

        System.out.println("---------------基于entryset进行遍历------------------");
        //获取键值对的集合
        Set<Map.Entry<String, Integer>> entries = scoreMap.entrySet();
        System.out.println("键值对的集合"+entries);
        //基于entryset的iterator遍历
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("entry的格式："+next);
            System.out.println("自己获取key和value"+next.getKey()+ next.getValue());
        }





//        System.out.println(scoreMap);
    }

}
