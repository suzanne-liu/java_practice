package come.testing.class3;

// 求100以内的偶数；偶数的特质：能够被2整除

public class EvenNum {
    public static void main(String[] args) {
        for(int i=0;i<101;i++){
            if((i%2)==0){
                System.out.println(i);
            }
        }

    }
}
