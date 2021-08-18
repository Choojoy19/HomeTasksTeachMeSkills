package lesson3;

import java.util.Random;

public class HomeTaskExtra5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
