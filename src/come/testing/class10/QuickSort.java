package come.testing.class10;

import java.util.Arrays;

/**
 * @Classname QuickSort
 * @Description 类型说明
 * @Date 2021/8/26 20:32
 * @Created by 特斯汀Roy
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 9, 1, 3, 8, 5};
        qSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 递归操作需要的参数：
     *
     * @param a     排序的数组
     * @param start 排序起点
     * @param end   排序终点
     */
    public static void qSort(int[] a, int start, int end) {
        //先生成左右游标
        int left = start;
        int right = end;
        //选取基准值为最左边的数
        int base = a[left];
        //循环完成一轮快速排序
//        外层：  从左到右和从右到左，不断进行交换。条件：  left<right
        while (left < right) {
            //从右往左
            while (left < right) {
                //如果右边的数比基准值大 ，right 向前走 right--
                if (a[right] > base) {
                    right--;
                } else {
                    //其实是left和right进行交换
                    int tmp=a[right];
                    a[right]=a[left];
                    a[left]=tmp;
                    //同时left向前走，left++。
                    left++;
                    //切换为从左往右行进。
                    break;
                }
            }
//        内层：两个游标都往前走。  条件： left<right
            //从左往右行进
            while (left < right) {
//                如果左边的数比基准值小，left向前走，left++。
                if (a[left] < base) {
                    left++;
                } else {
                    //其实是left和right进行交换
                    int tmp=a[right];
                    a[right]=a[left];
                    a[left]=tmp;
                    //right向前走，right--。
                    right--;
                    //切换为从右往左行进。
                    break;
                }

            }
        }
        //递归操作
//        如果 right+1<end 就要排序右边 否则 不做操作  如果 left-1>start 就要排序左边，否则不做操作。
        if (left - 1 > start) {
            qSort(a, start, left - 1);
        }
        //递归退出条件：其实就是left-1<=start的时候啥也不做
        if (right + 1 < end) {
            qSort(a, right + 1, end);
        }

    }


}
