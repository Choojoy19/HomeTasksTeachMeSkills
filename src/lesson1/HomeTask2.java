package lesson1;
import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три стороны треугольника");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (((a+b)>c)&((a+c)>b)&((b+c)>a)){
            System.out.println("Треугольник с такими сторонами существует");
        } else {
            System.out.println("Треугольник с такими сторонами не существует");
        }



    }
}
