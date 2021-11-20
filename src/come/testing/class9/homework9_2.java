package come.testing.class9;

import java.util.Arrays;

public class homework9_2 {
    public static void main(String[] args) {

        int[] b = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] bubblesort = bubblesort3(b);
      //  System.out.println(Arrays.toString(bubblesort));
        System.out.println("选择倒序排列："+Arrays.toString(b));
    }

        public static int[] bubblesort3(int[] a){
            //题目：基于选择排序算法，对数组逆序遍历（从队尾到队首）实现降序排列
            //选择排序的核心：找出最值下标，放入指定坑中
            //1。以组尾为起始位置，将组尾定为放最小值的位置，逐步往[0]进行遍历；
            //2。用一个临时变量放遇到的最小值，一个临时变量放对应的下标
            // 3。遍历过程中将值与最小值进行对比，将更小的放到最小值临时变量中，并一起替换下标。
            //3。重新开始从尾部-1开始遍历，将第二大的放在[length-2] 以次类推
            //数组类型的变量，传递给方法进行改变之后，原本变量的值也会发生变化

            for (int i=a.length-1;i>=1;i--){
                int min=a[i];
                int min_xiabiao=i;
            for (int j=i-1;j>=0;j--){
                if(a[j]<min){
                    min=a[j];
                    min_xiabiao=j;
                }
            }
            int temp = a[i];
            a[i]=min;
            a[min_xiabiao]=temp;
        }
                return a;
        }



}
