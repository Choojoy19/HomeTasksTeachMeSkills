package lesson3;

import java.util.Random;

public class HomeTask4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i=0; i<arr.length;i++){
            arr[i]=rand.nextInt(21);
        }

        for (int el:arr){
            System.out.print(el+ " ");
        }
        System.out.println();
        int counter=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]%2!=0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
