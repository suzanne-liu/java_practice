package come.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class homeworkMap {
        //题目：对json返回结果进行解析，把data键中的子json内容转成map
        //网站返回
        private static String reponse_text = "{\"msg\":\"OK\",\"code\":0,\"data\":[{\"groupName\":\"通知\",\"unreadCount\":1,\"groupValue\":0},{\"groupName\":\"赞\",\"unreadCount\":0,\"groupValue\":1},{\"groupName\":\"回复\",\"unreadCount\":0,\"groupValue\":2},{\"groupName\":\"关注\",\"unreadCount\":0,\"groupValue\":3}]}";

    public static void main(String[] args) {
        //步骤1：text变object
        JSONObject jsonObject=JSON.parseObject(reponse_text);
        System.out.println(jsonObject);
        //步骤2：把object中的值一一取出，存入Map
        Map<String,Object> Map_object = new HashMap<>();  //建一个Map
        Set<String> all_key =jsonObject.keySet();
        System.out.println("所有的key:"+all_key);
        for (String i:all_key) {
            System.out.println("把 "+i+" 放到Map中，它的值是："+jsonObject.get(i));
            Map_object.put(i,jsonObject.get(i));
        }
        System.out.println(Map_object);

        System.out.println("---------------------------");
        //将Map中的重新拼接为字符串
        String new_str = "{"+"\n";
        for (String i:Map_object.keySet()) {
            if(Map_object.get(i) instanceof JSONArray) {
                new_str += "\"" + i + "\"" + ":" + Map_object.get(i) + "," + "\n";
            }else {
                new_str += "\"" + i + "\"" + ":" + "\"" + Map_object.get(i) + "\"" + "," + "\n";
            }
        }
        new_str = new_str.substring(0,new_str.length()-2);
        new_str += "}";
        System.out.println("json字符串："+new_str);
    }

}
