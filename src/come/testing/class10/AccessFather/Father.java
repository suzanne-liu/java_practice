package come.testing.class10.AccessFather;

/**
 * @Classname Father
 * @Description 类型说明
 * @Date 2021/8/26 23:17
 * @Created by 特斯汀Roy
 */
public class Father {
    //私有的
    private int age=31;
    private String name="王周知";
    //Default级别，是不写权限修饰符
    String money="家里的钱";

    protected String caili="彩礼";

    public String voice="说话";

    private void changeName(){
        System.out.println("只有自己能改名字");
    }

    void spendMoney(){
        System.out.println("同一个包里的人都能用钱");
        changeName();
    }

    protected void giveCaili(){
        System.out.println("儿子结婚把"+caili+"给出去");
    }

    public void speak(){
        System.out.println("所有人都能和我说话");
    }

    public static void main(String[] args) {
        Father roy=new Father();
        roy.changeName();
    }




}
