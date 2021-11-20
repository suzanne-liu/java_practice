package come.testing.class3;

//求1-100中的质数;特质：不能被任何大于1，小于它本身的数整除

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("质数：1");
        System.out.println("质数：2");
        for (int i=3;i<101;i++){
           for (int j=2;j<i;j++){
               if ((i%j)==0){
                   //System.out.println(i+"不是质数");
                   break;
               }
               if ((j+1)==i){
                   System.out.println("质数："+i);
               }
           }
        }
    }
}
