package lesson2;

public class HomeTask8_2 {
    public static void main(String[] args) {
        int t=0;
        for (int i = 0;i<4;i++){
            for (int j=0;j<4;j++){
                if (j>=t){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
              }
            t++;
            System.out.println();
        }
    }
}
