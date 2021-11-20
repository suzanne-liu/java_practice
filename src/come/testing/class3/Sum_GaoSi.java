package come.testing.class3;

//高斯求和：从1加到100的和是多少
public class Sum_GaoSi {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        for (; i<101;i++){
             result = result+i;
        }
        System.out.println("此时i 是："+(i-1));
        System.out.println("求和结果："+result);
    }
}
