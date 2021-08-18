package lesson3;


import java.util.Random;
import java.util.Scanner;

public class HomeTaskExtra7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите заданное значение [0;19]");
        int number = scanner.nextInt();
        int [] arr = new int[30];
        for (int i=0;i< arr.length;i++){
            arr[i]=random.nextInt(20);
        }
        for (int el:arr){
            System.out.print(el + " ");
        }
        System.out.println();
        int counter=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==number){
                counter++;
            }
        }
        System.out.println("заданное значение "+number+" встречается "+counter+" раза");
    }
}
