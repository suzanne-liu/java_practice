package come.testing.class7;

/**
 * @Classname StringbuilderTest
 * @Description 类型说明
 * @Date 2021/8/20 20:42
 * @Created by 特斯汀Roy
 */
public class StringbuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        //在builder中追加一个字符串
        stringBuilder.append("老师").append("roy").append("教java");
        stringBuilder.insert(4,"胖子");
        String sb = stringBuilder.toString();
        //输出的时候，其实就是调用了toString方法。
        System.out.println(stringBuilder);

        System.out.println("-------------buffer操作----------");
        StringBuffer stringBuffer=new StringBuffer();
        //在builder中追加一个字符串
        stringBuffer.append("老师").append("roy").append("教java");
        stringBuffer.insert(4,"胖子");
        String sbf = stringBuffer.toString();
        System.out.println(sbf);

        //自我练习
        StringBuilder SS=new StringBuilder();
        SS.append('s');  //往字符串里添加一个字符
        SS.append(1);  //往字符串里添加一个整数
        SS.append("suzanne");
        System.out.println(SS);
    }
}
