package lesson1;
import java.util.Scanner;
public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1>number2){
            System.out.println(number1);
        } else if (number2>number1){
            System.out.println(number2);
        } else {
            System.out.println("Числа равны");
        }
    }
}
