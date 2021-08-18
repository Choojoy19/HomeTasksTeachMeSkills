package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите максимальное значение элемента массива и его размер(больше трех)");
        int size = scanner.nextInt();

        if (size<4){
            System.out.println("Вы ввели недопустимый размер массива");
        } else {
            int [] arr1 = new int[size];
            for (int i =0; i<arr1.length;i++){
                arr1[i]=random.nextInt(size+1);
            }
            for (int element:arr1) {
                System.out.print(element+" ");
            }

            int counterInt =0;

            for (int i =0; i<arr1.length;i++){
                if (arr1[i]%2==0){
                    counterInt++;
                }
            }
            int j=0;
            int[] arr2 = new int[counterInt];
            for (int i =0; i<arr1.length;i++){
                if (arr1[i]%2==0){
                    arr2[j]=arr1[i];
                    j++;
                }
            }
            System.out.println();
            for (int element:arr2){
                System.out.print(element+" ");
            }
        }
    }
}
