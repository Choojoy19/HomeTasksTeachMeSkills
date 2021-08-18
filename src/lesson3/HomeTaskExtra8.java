package lesson3;

import java.util.Random;

public class HomeTaskExtra8 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        int max=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        int max2 =0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i]>max2&&arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println(max2);

    }
}
