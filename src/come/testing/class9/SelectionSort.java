package come.testing.class9;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname SelectionSort
 * @Description 类型说明
 * @Date 2021/8/24 20:59
 * @Created by 特斯汀Roy
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] b={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
//        Arrays.sort(b);
        sSort(b);
        System.out.println(Arrays.toString(b));
    }

    public static void sSort(int[] a){
        for(int lun=1;lun<=a.length-1;lun++){
//        第n轮：先选第n个数，也就是下标n-1,作为最小的数
            int mini=a[lun-1];
            int minIndex=lun-1;
            System.out.println(Arrays.toString(a));
//        比较范围：从第n+1个数开始比到第length个数
//        下标：     n到length-1
            for(int xiabiao=lun;xiabiao<=a.length-1;xiabiao++){
//                如果最小的数比当前数大，那么更新最小的数的值和位置。
                if(a[xiabiao]<mini){
                    mini=a[xiabiao];
                    minIndex=xiabiao;
                }
            }
            //        交换第n个数和当前最小数的位置。
            //因为已经有mini了，就不需要额外的变量tmp了
            //注意先应该把最小位置的值改成第n个数的值
            a[minIndex]=a[lun-1];
            //然后再把第n个数改成最小的值
            a[lun-1]=mini;
        }

    }


}
