package lesson2;
import java.util.Scanner;
public class MetanitTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double sum = scanner.nextDouble();
        System.out.println("Введите срок вклада в месяцах");
        int months = scanner.nextInt();

        for (int i=1; i<=months;i++){
            sum +=sum*0.07;
        }
        System.out.println("После " +months+ " месяцев сумма вклада составит "+sum);
    }
}
