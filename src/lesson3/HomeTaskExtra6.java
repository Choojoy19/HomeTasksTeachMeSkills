package lesson3;

import java.util.Random;
import java.util.Arrays;
public class HomeTaskExtra6 {
    public static void main(String[] args) {
        Random random = new Random();
        //int[] arr = {2,2,2,2};
        int [] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        int counter=0;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                counter++;
            }
        }
            if (counter>0){
                System.out.println("есть повторяющиеся элементы");

            }else {
                System.out.println("все элементы разные");
            }
        }

}
