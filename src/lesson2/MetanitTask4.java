package lesson2;

import java.util.Scanner;

public class MetanitTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double sum = scanner.nextDouble();
        System.out.println("Введите срок вклада в месяцах");
        int months = scanner.nextInt();
        int a =0;
        while (a<months){
            a++;
            sum+=sum*0.07;
        }
        System.out.println("После " +months+ " месяцев сумма вклада составит "+sum);
    }
}
