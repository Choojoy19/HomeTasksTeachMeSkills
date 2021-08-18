package lesson3;



public class HomeTask1 {
    public static void main(String[] args) {
        int [] arr= new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=i*2+2;
            }
        for (int a: arr){
            System.out.print(a+" ");
            //System.out.println(a);
        }
        System.out.println();
        for (int a: arr){
            //System.out.print(a+" ");
            System.out.println(a);
        }



    }
}
