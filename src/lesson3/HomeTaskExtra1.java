package lesson3;

import java.util.Random;

public class HomeTaskExtra1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i=0;i< arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        for (int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        int multiplex = 1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%3==0){
                multiplex*=arr[i];
            }
        }
        System.out.println(multiplex);
    }
}
