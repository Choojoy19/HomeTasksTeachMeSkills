package lesson1;
import java.util.Scanner;
public class HomeTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество программистов");
        int number = scanner.nextInt();
        int k = number%10;
        if (number==11){
            System.out.println("11 программистов");
        } else if (k>1&k<5){
            System.out.println(number+" программиста");
        } else if (k>4&k<=9|(k==0)){
            System.out.println(number+ " программистов");
        } else {
            System.out.println(number+ " программист");
        }

    }
}
