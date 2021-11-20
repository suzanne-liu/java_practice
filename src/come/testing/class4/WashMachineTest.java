package come.testing.class4;

/**
 * @Classname WashMachineTest
 * @Description 类型说明
 * @Date 2021/8/12 21:02
 * @Created by 特斯汀Roy
 */
public class WashMachineTest {
    public static void main(String[] args) {
        //声明对象
        WashMachine xiaoai;
        //实例化操作，将类模板具象为一个对象，从而可以使用。
        //完成赋值操作，在JVM中会为对象分配内存来进行存储。这时才能真正的使用洗衣机。
        xiaoai =new WashMachine();
        //通过.操作调用对象的方法或者属性
//        String xaColor=xiaoai.color;
//        //取到的值直接当字符串使用，类似于System.out.println("品牌是"+xiaoai.品牌);的操作。
//        xiaoai.color.contains("");
//        System.out.println("品牌是"+xiaoai.品牌);
//        xiaoai.dryClothes("脏兮兮的湿衣服",10);


//        //调用返回类型为String的方法,可以直接进行调用
////        xiaoai.washClothes();
//        //等价于下面一句
//       String cleanClothes = xiaoai.washClothes();   //cleanClothes得到的只是一个return结果，其他打印的是在调用方式的过程输出
//        System.out.println("输出结果"+cleanClothes);  //使用cleanClothes时，是有return
//        //等价于上面两句，先调用方法执行，然后得到返回结果，进行sout。
 //       System.out.println("输出结果"+xiaoai.washClothes());
//        //以下两句效果上等价
 //       System.out.println(xiaoai.washClothes().contains("干净"));
//        "洗干净的衣服".equals("洗干净的衣服");
//
//        //调用void返回的方法
//        xiaoai.washSelf();
//
//        //调用带有参数列表的方法
//        //传递参数给的是实际的值，我们叫他实参，注意和参数列表指定的类型相匹配
//        String dryResult = xiaoai.dryClothes("脏兮兮的湿衣服", 5);
//        System.out.println(dryResult);

    }

}
