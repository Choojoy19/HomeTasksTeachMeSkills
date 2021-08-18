package lesson3;

import java.util.Random;

public class HomeTask8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        for (int i =0;i< arr1.length;i++){
            arr1[i]=random.nextInt(10);
        }
        for (int element:arr1){
            System.out.print(element+" ");
        }
        System.out.println();
        for (int i =0;i< arr2.length;i++){
            arr2[i]=random.nextInt(10)+1;
        }
        for (int element:arr2){
            System.out.print(element+" ");
        }
        System.out.println();
        int wholeNumber=0;
        for (int i=0;i< arr3.length;i++){
            arr3[i]=(arr1[i]+0.0)/arr2[i];
            if (arr3[i]%1==0) {
                wholeNumber++;
            }
        }
        for (double element:arr3){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("целых чисел - "+wholeNumber);
    }
}
