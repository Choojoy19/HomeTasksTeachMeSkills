package lesson1;
import java.util.Scanner;
public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number>0){
            number+=1;
        } else if (number<0) {
            number-=2;
        } else {
            number=10;
        }

        System.out.println("Результат: " +number);

    }
}
