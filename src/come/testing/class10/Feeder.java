package come.testing.class10;

/**
 * @Classname Feeder
 * @Description 类型说明
 * @Date 2021/8/26 22:03
 * @Created by 特斯汀Roy
 */
public class Feeder {

    /**
     * 去喂养一个动物
     * @param a
     */
    public void feedMaster(Animal a){
        System.out.println("铲屎官开始给"+a.kind+"喂食了");
        a.eat();
    }

}
