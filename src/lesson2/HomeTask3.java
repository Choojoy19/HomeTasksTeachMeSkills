package lesson2;

public class HomeTask3 {
    public static void main(String[] args) {
        int sum1 = 1;
        int counter = 1;
        for (int i=1; i<=8; i++){
            sum1*=2;
            counter +=sum1;
            //System.out.println(sum1);
            //System.out.println(counter);
        }
        System.out.println(counter);
            int sum2 =0;
        for (int k = 1;k<=256;k*=2){
            sum2 +=k;
            //System.out.println(sum);
        }
        System.out.println(sum2);
    }
}
