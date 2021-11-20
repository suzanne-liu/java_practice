package come.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname SimpleJsonObject
 * @Description 类型说明
 * @Date 2021/8/22 21:39
 * @Created by 特斯汀Roy
 */
public class SimpleJsonObject {
    public static void main(String[] args) {
        String text="{\"status\":200,\"msg\":\"恭喜您，登录成功\",\"userid\":\"3287\"}";
        //json对象
        JSONObject jsonObject = JSON.parseObject(text);
        //存储为ObjectMap,根据值类型不同进行存储
        Map<String,Object> objectMap=new HashMap<>();
        //先判断一下是否是一个字符串
        for(String key:jsonObject.keySet()){
            if(jsonObject.get(key) instanceof String){
                //获取的时候，特定使用字符串。
                System.out.println(key+"的值是字符串");
                objectMap.put(key,jsonObject.getString(key));
            }else{
                System.out.println(key+"不是字符串");
                objectMap.put(key,jsonObject.get(key));
               // jsonObject.
            }
        }
        System.out.println(objectMap);

        //拼接
        //json格式以{开头
        String rejson="{";
        //json格式中，字符串的值需要""，其它的值都不需要。
        for (String key : objectMap.keySet()) {
            //如果是字符串，拼""  "key":"值",
            if(objectMap.get(key) instanceof String){
                rejson+="\""+key+"\":\""+objectMap.get(key)+"\",";
            }else{
                //不是字符串，则不用""   "key":值,
                rejson+="\""+key+"\":"+objectMap.get(key)+",";
            }
        }
        rejson=rejson.substring(0,rejson.length()-1)+"}";
        System.out.println(rejson);
    }

}
