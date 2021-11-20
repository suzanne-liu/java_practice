package come.testing.class7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname RegexMatchTest
 * @Description 类型说明
 * @Date 2021/8/20 21:59
 * @Created by 特斯汀Roy
 */
public class RegexMatchTest {

    public static void main(String[] args) {
        /**
         * 获取每个对象的中文名称和链接地址。
         *     <a class="on" href="//www.51job.com/">首页</a>
         *     <a class="" href="https://search.51job.com">职位搜索</a>
         *     <a class="" href="javascript:openAreaChannelLayer();">地区频道</a>
         *     这里的target是个干扰项，用.*去表示可以有字符也可以没有
         *     .+href="(.*)".*>(.*)</a> 表达式匹配到的 href结果 是 https://edu.51job.com" target="_blank
         *     这是贪婪型表达式，匹配到最后一个满足条件的边界符才停止。
         *     .+href="(.*?)".*>(.*)</a>  表达式匹配到的 href结果  https://edu.51job.com
         *     非贪婪表达式:在量词 (*+{n,})后面再加个？，匹配到第一个符合条件的边界符就停止
         *     <a class="" href="https://edu.51job.com" target="_blank">无忧学园</a>
         *     <a class="" href="https://mkt.51job.com/careerpost/default_res.php">职场资讯</a>
         *     <a class="" href="https://xy.51job.com/default-xs.php">校园招聘</a>
         */
        String s=" <a class=\"\" href=\"https://edu.51job.com\" target=\"_blank\">无忧学园</a>";
        //定义正则表达式模板，用于进行搜索查找
        //pattern中用()表示进行匹配的时候的一个分组
        Pattern urlAndName=Pattern.compile(".+href=\"(.*?)\".*>(.*)</a>"); //定义模版
        //通过pattern的matcher对象进行匹配操作
        Matcher matcher = urlAndName.matcher(s);
        //进行匹配查找,find方法返回一个布尔值，true表示查找到了，false表示没找到。
        if(matcher.find()){
            System.out.println("找到了");
            //查找到的内容，基于()会进行分组
            //基于groupcount查找到的总分组数量，可以进行遍历
            System.out.println(matcher.groupCount());
            for(int i=0;i<=matcher.groupCount();i++){
                System.out.println("第"+i+"组的值是："+matcher.group(i));
            }

        }
        System.out.println(matcher.group(2)+"的url地址是"+matcher.group(1));

    }


}
