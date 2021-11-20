package come.testing.class9;

import java.util.Arrays;

/**
 * @Classname BubbleSort
 * @Description 类型说明
 * @Date 2021/8/24 20:26
 * @Created by 特斯汀Roy
 */
public class BubbleSort {
    public static void main(String[] args) {
        //数组类型的变量，传递给方法进行改变之后，原本变量的值也会发生变化
        int[] b={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] bubblesort = bubblesort(b);
        System.out.println(Arrays.toString(bubblesort));
        System.out.println(Arrays.toString(b));

    }

    public static int[] bubblesort(int[] a){
//        第n轮：从第1个数比较，直到比较到 第 a.length -(n-1)个数
//        1和2比   2和3比 >>>>>   a.length-n和a.length-(n-1)比   一共比较 a.length-n次
//        下标：     0和  1    1和2       a.length-n-1 和a.length-n比
        //从第1轮到第length-1轮
        for(int lun=1;lun<=a.length-1;lun++){
            //        内层循环：
//        两两进行比较。如果前数比后数大，则交换，否则不动（包括了等于）。
//        if(a[index]>a[index+1])
            for(int xiabiao=0;xiabiao<=a.length-lun-1;xiabiao++){
                //如果一个数比后面的数大，就交换
                if(a[xiabiao]>a[xiabiao+1]){
                    int tmp=a[xiabiao];
                    a[xiabiao]=a[xiabiao+1];
                    a[xiabiao+1]=tmp;
                }
                else{
                    //否则不动。
                }
            }

        }
        return a;
    }


}
