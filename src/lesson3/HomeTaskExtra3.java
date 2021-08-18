package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeTaskExtra3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число С");
        int c = scanner.nextInt();
        int[] arr = new int[10];
        for (int i =0;i< arr.length;i++){
            arr[i]=random.nextInt(10);
        }
        for (int el:arr){
            System.out.print(el+" ");
        }
        System.out.println();
        int sum = 0;
        int counter=0;
        for (int i =0;i< arr.length;i++) {
            if (arr[i]>c){
                sum+=arr[i];
                counter++;
            }
        }
        System.out.println("ср арифм чисел>"+c+" = "+((sum+0.0)/counter));
    }
}
