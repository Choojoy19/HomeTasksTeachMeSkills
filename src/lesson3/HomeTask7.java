package lesson3;

import java.util.Random;

public class HomeTask7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i =0;i< arr.length;i++){
            arr[i]=random.nextInt(16);
        }
        for (int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        int max=0;
        int maxIndex = 0;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                maxIndex = i;
            }
        }
        System.out.println("наибольшее число - "+max+ " с индексом "+maxIndex);
    }
}
