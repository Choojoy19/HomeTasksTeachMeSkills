package lesson1;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        String bitness = "";
        String sign = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number%10 == number) {
            bitness = "однозначное";
        } else if (number%100 == number) {
            bitness = "двузначное";
        } else if (number%1000 == number) {
            bitness = "трехзначное";
        } else {
            System.out.println("Введенное число > трехзначного");
        }

        if (number>0){
            sign = "положительное";
        } else if (number<0) {
            sign = "отрицательное";
        } else {
            System.out.println("Введенное число = 0");
        }

        System.out.println(number + " - это "+bitness+ " " +sign+" число.");
    }
}
