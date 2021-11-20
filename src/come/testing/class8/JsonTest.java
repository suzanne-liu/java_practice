package come.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname JsonTest
 * @Description 类型说明
 * @Date 2021/8/22 20:27
 * @Created by 特斯汀Roy
 */
public class JsonTest {

    private static String iptext="{\n" +
            "  \"ResultCode\": \"0\",\n" +
            "  \"ResultNum\": \"1\",\n" +
            "  \"Result\": [\n" +
            "    {\n" +
            "      \"DisplayData\": {\n" +
            "        \"strategy\": {\n" +
            "          \"tempName\": \"ip\",\n" +
            "          \"precharge\": \"0\",\n" +
            "          \"ctplOrPhp\": \"1\"\n" +
            "        },\n" +
            "        \"resultData\": {\n" +
            "          \"tplData\": {\n" +
            "            \"srcid\": \"5809\",\n" +
            "            \"resourceid\": \"5809\",\n" +
            "            \"OriginQuery\": \"3.3.3.4\",\n" +
            "            \"origipquery\": \"3.3.3.4\",\n" +
            "            \"query\": \"3.3.3.4\",\n" +
            "            \"origip\": \"3.3.3.4\",\n" +
            "            \"location\": \"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\n" +
            "            \"userip\": \"\",\n" +
            "            \"showlamp\": \"1\",\n" +
            "            \"tplt\": \"ip\",\n" +
            "            \"titlecont\": \"IP\\u5730\\u5740\\u67e5\\u8be2\",\n" +
            "            \"realurl\": \"http:\\/\\/www.ip138.com\\/\",\n" +
            "            \"showLikeShare\": \"1\",\n" +
            "            \"shareImage\": \"1\",\n" +
            "            \"data_source\": \"AE\"\n" +
            "          },\n" +
            "          \"extData\": {\n" +
            "            \"tplt\": \"ip\",\n" +
            "            \"resourceid\": \"5809\",\n" +
            "            \"OriginQuery\": \"3.3.3.4\"\n" +
            "          }\n" +
            "        }\n" +
            "      },\n" +
            "      \"ResultURL\": \"http:\\/\\/www.ip138.com\\/\",\n" +
            "      \"Weight\": \"2\",\n" +
            "      \"Sort\": \"1\",\n" +
            "      \"SrcID\": \"5809\",\n" +
            "      \"ClickNeed\": \"0\",\n" +
            "      \"SubResult\": [],\n" +
            "      \"SubResNum\": \"0\",\n" +
            "      \"ar_passthrough\": [],\n" +
            "      \"RecoverCacheTime\": \"0\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"QueryID\": \"1793144780\",\n" +
            "  \"Srcid\": \"5809\",\n" +
            "  \"status\": \"0\",\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"srcid\": \"5809\",\n" +
            "      \"resourceid\": \"5809\",\n" +
            "      \"OriginQuery\": \"3.3.3.4\",\n" +
            "      \"origipquery\": \"3.3.3.4\",\n" +
            "      \"query\": \"3.3.3.4\",\n" +
            "      \"origip\": \"3.3.3.4\",\n" +
            "      \"location\": \"\\u7f8e\\u56fd \\u4e9a\\u9a6c\\u900a\\u4e91\",\n" +
            "      \"userip\": \"\",\n" +
            "      \"showlamp\": \"1\",\n" +
            "      \"tplt\": \"ip\",\n" +
            "      \"titlecont\": \"IP\\u5730\\u5740\\u67e5\\u8be2\",\n" +
            "      \"realurl\": \"http:\\/\\/www.ip138.com\\/\",\n" +
            "      \"showLikeShare\": \"1\",\n" +
            "      \"shareImage\": \"1\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static void main(String[] args) {
//        System.out.println(iptext);
        //正则表达式
//        Pattern origQr=Pattern.compile("\"OriginQuery\": \"(.*?)\",");
//        Matcher matcher = origQr.matcher(iptext);
//        matcher.find();
//        System.out.println(matcher.group(1));

        //json处理的方法：
        //Jsonpath语法进行json表达式中的键提取。
        System.out.println(JSONPath.read(iptext, "$.Result[0].DisplayData.resultData.tplData.OriginQuery"));
        //转成string,上面一个返回的是object
        String originQuery = JSONPath.read(iptext, "$.Result[0].DisplayData.resultData.tplData.OriginQuery").toString();
        System.out.println(originQuery);
        System.out.println("-------------------");
        //解析方法：直接将字符串转换为fastjson中定义的json对象类。
        //将String转成了jsonobject。
        JSONObject ipjson = JSON.parseObject(iptext);
        System.out.println("-------json string 格式---------");
        System.out.println(iptext);
        System.out.println("-------json object 格式---------");
        System.out.println(ipjson);
        System.out.println("-------------------");

        //和使用map类似，用key的set来完成遍历
        Set<String> jsonKey = ipjson.keySet();
        //map如果想存成String，String格式？
        Map<String,String> ipStrMap=new HashMap<>();
        //map 存的时候，存原本的类型？
        Map<String,Object> obMap=new HashMap<>();

        System.out.println("--------- 进入循环 ----------");
        //获取值的时候，获取为object。
        for (String key : jsonKey) {   //从Json中循环取值，这里按key定位取值
            System.out.println(key + "的值是：" + ipjson.get(key));    //取key中对应的值
            //存储为string，string格式，不管json值是啥类型，都转成string再存。
            ipStrMap.put(key,ipjson.get(key).toString());  //取key中对应的值，并转为string格式，存入map
            //解析出的值，判断是否为一个jsonArray
            //分两种情况，一种值是jsonArray数组，一种值是字符串。
            if(ipjson.get(key) instanceof JSONArray){   //判断key所对应的vaule是不是一个JSONArray
                System.out.println(key+"的值是一个数组");
                JSONArray resultArray = (JSONArray)ipjson.get(key);   //在已知是jsonarray的前提下，强转为JSONArray实例对象
                JSONObject resultjson = (JSONObject)resultArray.get(0);  //把数组中的第一个元素取出来
                System.out.println(key+"的内容是"+ resultjson);
                //jsonArray对象也是个object。
                obMap.put(key,resultArray);
            }else{
                System.out.println(key+"的值不不不是一个数组");
                //获取为字符串。
                String string = ipjson.getString(key);
                obMap.put(key,string);
            }


        }
//        //获取为数组。
//        JSONArray jsonArray = ipjson.getJSONArray("Result");
//        System.out.println("获取出的数组是："+jsonArray);
//        //获取result数组中的第一个元素，是一个子json。
//        JSONObject resultJson = jsonArray.getJSONObject(0);

        System.out.println("全部按string存储："+ipStrMap);
        System.out.println("按照object类型存储"+obMap);


    }



}
