package come.testing.class3;

public class ForTest {

    public static void main(String[] args) {

        //从1数数数到10
        for (int i = 1; i <= 10; ++i) {
            //循环体语句
            System.out.println(++i);
        }

        //数3的倍数
        for (int i = 3; i <= 10; i += 3) {
            //循环体语句
            System.out.println(i);
        }


        //死循环,一定要注意避免，注意循环一定是能够有满足不符合条件，退出循环的情况出现的。
//        int k=4;
//        int m=3;
//        for(int i=3;k<11;m+=10000){
//            System.out.println(i);
//            //让k<5的循环条件可以不再成立
//            k+=2;
//        }
//        System.out.println(i);


    }
}

