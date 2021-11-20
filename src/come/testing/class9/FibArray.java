package come.testing.class9;

/**
 * @Classname FibArray
 * @Description 类型说明
 * @Date 2021/8/24 22:20
 * @Created by 特斯汀Roy
 */
public class FibArray {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    /**
     * 求第n项斐波那契数列的值
     * @param n
     * @return
     */
    public static int fib(int n){
        //递归出口条件
        if(n==1||n==2){
            return 1;
        }else{
            int result=fib(n-1)+fib(n-2);
            return result;
        }
    }

}
