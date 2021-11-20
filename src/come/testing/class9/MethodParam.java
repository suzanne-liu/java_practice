package come.testing.class9;

import come.testing.class4.WashMachine;

import java.lang.reflect.Array;

/**
 * @Classname MethodParam
 * @Description 类型说明
 * @Date 2021/8/24 21:26
 * @Created by 特斯汀Roy
 */
public class MethodParam {
    public static void main(String[] args) {
        //传递给方法进行操作的实参
        String roy="roy";
        //方法进行修改之后返回的结果
        String teacher = becomeTeacher(roy);
        //方法执行完之后，原本的变量值不变
        System.out.println(roy);
        //方法执行对参数的值进行了修改。
        System.out.println(teacher);
//        //传递对象作为方法参数，方法内修改之后，结果会改变。
//        WashMachine rou=new WashMachine();
//        System.out.println("传给方法之前，洗衣机的高度："+rou.getHeight());
//        changeWashMachineHeight(rou);
//        System.out.println("修改之后，洗衣机的高度："+rou.getHeight());

    }

    public static String becomeTeacher(String name){
        name+="老师";
        return name;
    }

    /**
     * 修改washMachine的成员变量高度。
     * @param washMachine
     */
    public static void changeWashMachineHeight(WashMachine washMachine){
        washMachine.setHeight(800);
    }

}
