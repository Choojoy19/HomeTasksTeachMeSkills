package lesson4;

import java.util.Scanner;

public class HomeTaskBonus {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char [][] arr = new char[3][3];
        int f=3;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]='-';
            }
        }
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int cond = 0;
        while(cond ==0) {
            System.out.println("1 игрок: введите координаты, где хотите поставить Х (знач коор-ты не более 3)");
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (arr[m - 1][n - 1] == '-') {
                arr[m - 1][n - 1] = 'X';
            } else {
                System.out.println("это место занято");
            }
            System.out.println("2 игрок: введите координаты, где хотите поставить 0 (знач коор-ты не более 3)");
            int k = scanner.nextInt();
            int t = scanner.nextInt();
            if (arr[k - 1][t - 1] == '-') {
                arr[k - 1][t - 1] = '0';
            } else {
                System.out.println("это место занято");
            }
            arr[k - 1][t - 1] = '0';
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1; j++) {
                    if (arr[i][j] == arr[i][j + 1] && arr[i][j + 1] == arr[i][j + 2] && arr[i][j] == 'X') {
                        System.out.println("выиграл 1й игрок");
                        cond = 1;
                    } else if ((arr[i][j] == arr[i][j + 1] && arr[i][j + 1] == arr[i][j + 2] && arr[i][j] == '0')) {
                        System.out.println("выиграл 2й игрок");
                        cond = 1;
                    }
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    if (arr[i][j] == arr[i + 1][j] && arr[i + 1][j] == arr[i + 2][j] && arr[i][j] == 'X') {
                        System.out.println("выиграл 1й игрок");
                        cond = 1;
                    } else if (arr[i][j] == arr[i + 1][j] && arr[i + 1][j] == arr[i + 2][j] && arr[i][j] == '0') {
                        System.out.println("выиграл 2й игрок");
                        cond = 1;
                    }
                }
            }
            int resM1 = 0;
            int resM2=0;

            for (int i = 0; i < 2; i++) {
                if (arr[i][i] == arr[i+1][i+1]&&arr[i][i] =='X') {
                    resM1 += 1;
                    //System.out.println(resM1);
                } else if (arr[i][i] == arr[i + 1][i + 1]&&arr[i][i] =='0'){
                    resM2 +=1;
                }
            }

                if (resM1 == 2) {
                    System.out.println("выиграл 1й игрок");
                    cond = 1;
                } else if (resM2 == 2) {
                    System.out.println("выиграл 2й игрок");
                    cond = 1;
                }


            int resP1 = 0;
            int resP2=0;
            int r=3;
            for (int i = 0; i < 2; i++) {
                if (arr[i][r-1] == arr[i+1][r-2]&&arr[i][i] =='X') {
                    resP1 += 1;
                    //System.out.println(resM1);
                } else if (arr[i][r-1] == arr[i+1][r-2]&&arr[i][i] =='0'){
                    resP2 +=1;
                }
                r--;
            }

            if (resP1 == 2) {
                System.out.println("выиграл 1й игрок");
                cond = 1;
            } else if (resP2 == 2) {
                System.out.println("выиграл 2й игрок");
                cond = 1;
            }



        }
    }
}
