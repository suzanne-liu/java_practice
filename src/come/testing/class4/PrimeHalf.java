package come.testing.class4;

/**
 * @Classname PrimeHalf
 * @Description 类型说明
 * @Date 2021/8/12 20:10
 * @Created by 特斯汀Roy
 */
public class PrimeHalf {

    public static void main(String[] args) {
        for(int num=2;num<=100;num++) {
            //因为循环结束之后需要使用dividor，所以不能在循环中定义局部变量dividor。
            int dividor = 2;
            for (; dividor <= (int)Math.sqrt(num) ; dividor++) {
                if (num % dividor == 0) {
                    //如果找到了能整除的数，就不是质数了
                    //找到了就不接着往下找了
                    break;
                }
            }
            //退出循环有两种情况：
            //1、如果是质数，那么结束循环的时候，dividor应该是num本身。
            //2、如果不是质数，中间找到了除数，就会退出，dividor不是num本身。
            //优化： 计算质数，只要取一半就可以了  循环到num/2
            //继续优化：算质数的时候，实际只要算到平方根
            //使用java中进行算术的类Math中的平方根方法sqrt计算平方根
            if (dividor > (int)Math.sqrt(num)) {
                System.out.print(num + " ");
            }
        }


    }

}
