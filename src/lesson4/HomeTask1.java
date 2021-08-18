package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размерность квадратной матрицы");
        int n = scanner.nextInt();
        int [][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=random.nextInt(51);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum =0;
        for (int i=0;i<n;i++) {
            if (arr[i][i] % 2 == 0) {
                sum += arr[i][i];
            }
        }
        System.out.println(sum);
    }
}
