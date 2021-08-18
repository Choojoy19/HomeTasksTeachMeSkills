package lesson3;

import java.util.Random;

public class HomeTask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int counter =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                counter++;
                System.out.print(arr[i]+" ");

            }

        }
        System.out.println();
        System.out.println(counter);
    }
}
