package come.testing.class7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class replaceEail {
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

//题目：编写邮箱的正则表达式，并且用pattern从中取出邮箱服务商，用replaceAll去替换邮箱格式为  www.服务商.com的格式
//        String s="<a class=\"on\" href=\"//www.51job.com/\">首页</a>";
//        //定义一个规则模版，只要写你需要提取的那一部分
//        Pattern rule=Pattern.compile(">(.*)<");
//        //通过pattern的matcher对象进行匹配操作
//        Matcher matcher = rule.matcher(s);
//if (matcher.find()){
//    System.out.println("找到了");
//    System.out.println(matcher.groupCount());
//    System.out.println(matcher.group(0));
//    System.out.println(matcher.group(1));
//    String y = s.replaceAll("//(.*)/\"","www."+matcher.group(1)+".com");
//    System.out.println(y);
//
//}
        System.out.println("---------------------------");
        String ss2="<a class=\"on\" href=\"//roy@163.com/\">首页</a>";
        Pattern rule2=Pattern.compile("//(.*)@");
        Matcher matcher2 = rule2.matcher(ss2);
        if (matcher2.find()){
            System.out.println(matcher2.groupCount());
            String yy2 = ss2.replaceAll("//(.*)@","//smtp.");
            System.out.println(yy2);
}
    }
}
