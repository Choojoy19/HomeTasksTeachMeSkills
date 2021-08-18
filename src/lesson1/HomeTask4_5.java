package lesson1;
import java.util.Scanner;
public class HomeTask4_5 {
    public static void main(String[] args) {
        int counterPos = 0;
        int counterNeg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1>0) {
            counterPos +=1;
        } else if (number1<0){
            counterNeg +=1;
        } else {}

        if (number2>0) {
            counterPos +=1;
        } else if (number2<0){
            counterNeg +=1;
        } else {}

        if (number3>0) {
            counterPos +=1;
        } else if (number3<0){
            counterNeg +=1;
        } else {}
        System.out.println("Положительных чисел: "+ counterPos);
        System.out.println("Отрицательных чисел: "+ counterNeg);
    }
}
