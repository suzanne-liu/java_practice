package come.testing.class3;

//输出三角九九乘法表

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("这是一个正常的九九乘法表");
        for(int i=1;i<10;i++){
            for (int j=1;(j<10)&&(j<i+1);j++){
                System.out.print(j+"X"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
