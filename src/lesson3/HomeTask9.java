package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива случайных чисел");
        int size = scanner.nextInt();
        if ((size < 2) || (size % 2 != 0) || (size % 1 != 0)) {
            System.out.println("Вы ввели не валидное число (нечетное,нецелое, либо меньше двух)");
            
        } else {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(16);
            }
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.length / 2; i++) {
                sum1 += arr[i];
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                sum2 += arr[i];
            }
            if (sum1 > sum2) {
                System.out.println("сумма первой половины массива больше");
            } else if (sum1 < sum2) {
                System.out.println("сумма второй половины массива больше");
            } else {
                System.out.println("суммы половин равны");
            }
        }
    }
}
