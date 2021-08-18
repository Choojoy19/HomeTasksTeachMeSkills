package lesson1;

public class ApplicationDemo {
    public static void main(String[] args) {
        int number = 8;
        long numberL = 8;
        float numberF = 2.5F;
        double numberD = 2.5;
        char letter  = 'F';
        System.out.println(letter);
        //numberD = number;
        System.out.println(numberL);
        System.out.println(numberF);
        number = (int)numberD;
        System.out.println(numberD);
        System.out.println(number);
        System.out.println("Hello World!");

    }
}
