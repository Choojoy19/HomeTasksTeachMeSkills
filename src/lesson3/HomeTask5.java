package lesson3;

import java.util.Random;

public class HomeTask5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i=0; i<arr1.length;i++){
            arr1[i]=rand.nextInt(16);
        }
        for (int i=0; i<arr2.length;i++){
            arr2[i]=rand.nextInt(16);
        }
        for (int el:arr1){
            System.out.print(el+ " ");
        }
        System.out.println();
        for (int el:arr2){
            System.out.print(el+ " ");
        }
        System.out.println();
        double average1=0;
        double average2=0;
        double sum1=0;
        double sum2=0;
        for (int i=0; i<arr1.length;i++){
            sum1 += arr1[i];
            average1 =sum1/arr1.length;
        }
        System.out.println(average1);
        for (int i=0; i<arr2.length;i++){
            sum2 += arr2[i];
            average2 =sum2/arr2.length;
        }
        System.out.println(average2);
        if (average1>average2){
            System.out.println("Ср арифм первого массива больше");
        } else if (average1<average2){
            System.out.println("Ср арифм второго массива больше");
        }else {
            System.out.println("Ср арифм равны");
        }
    }
}
