package lesson2;
import java.util.Scanner;
public class MetanitTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cond = 0;

        while (cond!=1){
            System.out.println("Введите 2 числа для умножения");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Результат: "+a*b);
            System.out.println("Введите 1, если хотите выйти, либо ввести ДР. число, если хотите продолжить");
            cond = scanner.nextInt();
        }
    }
}
