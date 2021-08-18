package lesson3;

import java.util.Random;

public class HomeTaskExtra2 {
    public static void main(String[] args) {
        Random random= new Random();
        int [] arr = new int[10];
        for (int i =0;i< arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        for (int el:arr){
            System.out.print(el +" ");
        }
        System.out.println();
        int sum=0;
        int counter = 0;
        for (int i =1;i< arr.length;i+=2){ //если считать номера эл-тов по i, если в реальности по массиву, то нач с i=0
            sum += arr[i];
            counter++;

        }
        System.out.println((sum+0.0)/counter);

    }
}
