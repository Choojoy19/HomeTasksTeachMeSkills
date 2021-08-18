package lesson3;

import java.util.Random;

public class HomeTaskExtra9 {
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
        int min=arr[0];
        for (int i=0;i< arr.length;i+=2){ // в реальном массиве (не по i) начинать с i=1
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
