package come.testing.class4;

import java.sql.SQLOutput;

/**
 * @Classname WashMachine
 * @Description 类型说明
 * @Date 2021/8/12 20:37
 * @Created by 特斯汀Roy
 */
public class WashMachine {
    //属性
    //java中可以使用中文作为（标识符）变量名，但是不建议。
    public String 品牌="海尔";
    //通常的规范场景下，一个变量通常定义为private。
    private int height=100;
    public int width=80;
    public String color="白色";
    //静态变量：idea中会用斜体标志。
    public static int voltage=220;
    //常量：
    public static final String NAME="洗衣机";

    //在类中不能直接进行操作调用，要在方法里写。
//    System.out.println();
    //方法
    //构造方法
//    public WashMachine(){
//        System.out.println("买一台洗衣机");
//    }

    public WashMachine(String brand){
        品牌=brand;
        System.out.println("买了一台"+品牌+"洗衣机");
    }
    //显示定义一下原本默认的无参构造方法。
    public WashMachine(){}


    /**
     * 这是个桶自洁的方法，封装要执行的操作流程。
     */
    public void washSelf(){
        System.out.println("----------------开始桶自洁---------------");
        System.out.println("放水");
        System.out.println("清洗洗衣桶");
        System.out.println("排水");
        System.out.println("用电量是"+voltage);
    }

    /**
     * 洗衣服的方法。
     * @return  返回字符串干净的衣服
     */
    public String washClothes(){
        System.out.println("------------------开始洗衣服-------------------");
        System.out.println("放水");
        System.out.println("加洗衣粉");
        System.out.println("旋转");
        System.out.println("排水");
        //retrun 返回指定类型的结果，并且结束方法运行，所以不要在return之后写语句
//        return "洗干净的衣服";
        System.out.println("漂洗");
        System.out.println("排水");
        return "洗干净的衣服";
    }

    /**
     * 传递参数的烘干衣服方法，传递衣服进去，判断是否需要烘干，返回烘干了多少件衣服的信息。
     * 形式参数，只有类型和名字，但是没有值，值在实际调用的时候，被传递过来。
     * @param clothes 参数 clothes 会进行判断是否是湿的
     * @param count  洗的衣服件数
     * @return
     */
    public String dryClothes(String clothes,int count){
        System.out.println("------------开始烘干-------------");
        if(clothes.contains("脏")){
            //在同一个类方法定义中调用其它的方法，直接用方法名()。
            washClothes();
        }
        if(clothes.contains("湿")){
            System.out.println(this.color+this.品牌+"洗衣机开始烘干湿衣服");
        }else{
            System.out.println("衣服是干的,进行杀毒操作");
        }
        System.out.println("烘干了"+count+"件衣服");
        return "烘干了"+count+"件衣服";
    }

    //set变量的方法，修改成员变量的值
    public void setHeight(int height) {
        //成员变量用this.表示是这个类中的height
        //实际使用的时候，同名的局部变量优先级高于成员变量，所以用this
        this.height = height;
    }

    //get变量的方法，获取变量的值。
    public int getHeight() {
        return height;
    }

    /**
     * 通电返回功率的方法
     * @param current  输入电流
     * @return  功率结果
     */
    //静态方法中可以使用静态变量。
    public static int supPower(int current){
        System.out.println("给洗衣机接上"+voltage+"V的电源");
        //基于额定电压和电流计算功率
        int power = voltage * current;
        System.out.println("产生的功率："+ power);
        return power;
    }

    /**
     * main方法是一个特殊的方法，
     * @param args
     */
    public static void main(String[] args) {
        //静态方法中不能使用非静态方法和非静态的变量。
//        washClothes();
//        System.out.println(品牌);
        //静态方法中可以使用静态变量。
//        System.out.println(voltage);
        //静态方法中可以使用静态方法。
        supPower(15);
    }


}
