package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeTask3 {
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
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
            int multM =1;
            for (int i=0;i<n;i++){
                multM*=arr[i][i];
            }
            System.out.println(multM);
            int multP=1;
            int k=n;
            for (int i=0;i<n;i++) {
                multP *= arr[i][k-1];
                k--;
            }
            System.out.println(multP);
            if (multM>multP){
                System.out.println("произв чисел на гл диагонали больше");
            } else if (multM<multP){
                System.out.println("произв чисел на побочн диагонали больше");
            } else {
                System.out.println("произведения равны");
            }
    }
}
