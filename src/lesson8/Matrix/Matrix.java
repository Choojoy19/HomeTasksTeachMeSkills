package lesson8.Matrix;

import java.util.Random;

public class Matrix {
    private double array [][];
    private int line;
    private int column;

    public Matrix(){

    }

    public Matrix(int line, int column){
        this.line = line;
        this.column = column;
        this.array = new double[line][column];
        fillArray();
    }

    private void fillArray(){
        Random random = new Random();
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                array[i][j]=random.nextInt(20)*1.1;
            }
        }
    }

    public void displayArray(){
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                System.out.printf("%6.2f",array[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplexArray (int number){
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                array[i][j]*= number;
            }
        }
    }

    public double [][] generateArray(){
        double [][] array = new double[line][column];
        Random random = new Random();
        System.out.println("******");
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                array[i][j]=random.nextInt(10);
                System.out.printf("%10.2f",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("******");

        return array;
    }

    public void sumArrays(double [][] array2){
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                this.array[i][j]+=array2[i][j];
            }
        }
    }

    public void multiplexArrays(double [][] array2){
        for (int i=0; i<line;i++){
            for(int j=0;j<column;j++){
                this.array[i][j]*=array2[i][j];
            }
        }
    }
}
