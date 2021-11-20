package come.testing.class9;

/**
 * @Classname JieCheng
 * @Description 类型说明
 * @Date 2021/8/24 22:08
 * @Created by 特斯汀Roy
 */
public class JieCheng {
    public static void main(String[] args) {
//        //阶乘算术：
//        //5!=5*4*3*2*1   n!=n*n-1*n-2*……*1  =n *(n-1)!
//        //for循环实现
//        int result=1;
//        for(int i=1;i<=5;i++){
//            result*=i;
//        }
//        System.out.println(result);
        System.out.println(jiecheng(10));
    }

    //求n的阶乘递归实现方式：
//    public static int jiecheng(int n){
//        //非递归的出口状态
//        if(n==1){
//            return 1;
//        }else if(n<=0){
//            return -1;
//        }else{
//            //递归实现
//            int result=n*jiecheng(n-1);
//            return result;
//        }
//    }

    public static int jiecheng(int n){

        return n==1?1:n*jiecheng(n-1);
    }


}
