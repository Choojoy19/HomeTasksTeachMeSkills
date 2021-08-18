package lesson2;

public class MetanitTask1 {
    public static void main(String[] args) {
        int population1 = 10000000;
        int population = 10000000;
        int difference = 6;

        for (int i=1;i<=10;i++){
            population1 += population1 * difference / 1000 ;
            System.out.println("В году "+ i+ " население "+population1);
        }

        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }
}
