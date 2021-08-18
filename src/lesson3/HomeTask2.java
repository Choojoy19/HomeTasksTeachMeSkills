package lesson3;

public class HomeTask2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i =0; i<arr.length;i++){
            arr[i]=1+2*i;
        }
        for (int el:arr){
            System.out.print(el + " ");
        }
        System.out.println();
        for (int i =(arr.length-1); i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
