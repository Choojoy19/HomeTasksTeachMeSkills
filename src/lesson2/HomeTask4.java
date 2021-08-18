package lesson2;
import java.util.Scanner;
public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
        int a = scanner.nextInt();
        System.out.println("Введите B");
        int b = scanner.nextInt();
        int counter =0;
        for (int i=0;i<b;i++){
            counter+=a;
        }
        System.out.println(counter);
    }
}
