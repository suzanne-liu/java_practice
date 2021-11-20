package come.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Classname SimpleJson
 * @Description 类型说明
 * @Date 2021/8/22 21:23
 * @Created by 特斯汀Roy
 */
public class SimpleJson {

    public static void main(String[] args) {
        String text="{\"status\":200,\"msg\":\"恭喜您，登录成功\",\"userid\":\"3287\"}";

        //json对象
        JSONObject jsonObject = JSON.parseObject(text);   //把字符串解析成一个json对象，顺序会不一样，只要键值对一样
        System.out.println(jsonObject);
        //java中的键值对存储格式就是 map,JsonObject 也基于键值对。
        //获取键集合
        Set<String> keySet = jsonObject.keySet();
        //存储为Map
        Map<String,String> stringMap=new HashMap<>();
        //存储为ObjectMap,根据值类型不同进行存储
        Map<String,Object> objectMap=new HashMap<>();
        for(String key:keySet){
            System.out.println(key+"的值是"+jsonObject.get(key));
            stringMap.put(key,jsonObject.getString(key));
        }
        System.out.println(stringMap);


        //将map拼接为一个json字符串
        //json格式以{开头
        String rejson="{";
        //每个键拼接的时候，基于值的类型，需要确定是否要拼双引号。
        //格式 "key":"stringMap.get(key)",
        for (String key:stringMap.keySet()){
            rejson+="\""+key+"\":\""+stringMap.get(key)+"\",";
        }
        //截取子串并且拼接}
        rejson=rejson.substring(0,rejson.length()-1)+"}";
        System.out.println(rejson);

    }




}
