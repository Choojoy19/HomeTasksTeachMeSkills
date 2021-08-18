package lesson2;

public class HomeTask1 {
    public static void main(String[] args) {
        double sum =10;
        double dayDistance = 10;
        for (int i=2;i<8;i++){
            dayDistance +=dayDistance*0.1;
            sum += dayDistance;
            //System.out.println("в день "+i+" пробежал "+dayDistance);
        }
        System.out.println(sum);
    }
}
