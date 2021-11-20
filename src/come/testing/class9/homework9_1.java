package come.testing.class9;

import java.util.Arrays;

public class homework9_1 {
    public static void main(String[] args) {

        int[] b = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] bubblesort = bubblesort2(b);
      //  System.out.println(Arrays.toString(bubblesort));
        System.out.println("倒序排列："+Arrays.toString(b));
    }

        public static int[] bubblesort2(int[] a){
            //题目：基于冒泡排序算法，对数组逆序遍历（从队尾到队首）实现降序排列
            //1。以组尾为起始位置，逐步往[0]进行遍历；
            //2。遍历过程中俩俩对比，将更大往前面挪，这样一轮下来，最大的就在[0]
            //3。重新开始从尾部开始遍历，将第二大的放在[1] 以次类推
            //数组类型的变量，传递给方法进行改变之后，原本变量的值也会发生变化
        int temp=0;
            for (int i=1;i<a.length;i++){
            for (int j=a.length-1;j>=i;j--){
                if(a[j-1]<a[j]){
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
                return a;
        }



}
