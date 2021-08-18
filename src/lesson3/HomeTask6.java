package lesson3;

import java.util.Random;

public class HomeTask6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = {9,6,5,2} ;
        //int[] arr = new int[4];
        //for (int i=0; i<arr.length;i++){
        //    arr[i]=rand.nextInt(11);
        //}
        for (int el:arr){
            System.out.print(el+ " ");
        }
        System.out.println();
        int counter1=0;
        int counter2=0;
        for (int i=1; i<4;i++) {
            if (arr[i-1] < arr[i]) {
                counter1++;
            }
            if (arr[i-1] > arr[i]){
                counter2++;
            }
        }
        System.out.println(counter1);
        System.out.println(counter2);
        if (counter1==3){
            System.out.println("Возрастающая последовательность");
        }
        if (counter2==3){
            System.out.println("Убывающая последовательность");
        }
    }
}
