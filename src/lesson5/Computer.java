package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
        private int cpu;
        private int ram;
        private int hdd;
        private int resource;

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
    public int turnOn (){
        Random random = new Random();
        Scanner scannerOn = new Scanner(System.in);
        int counter = 0;
        int failure = random.nextInt(2);
        System.out.println("угадайте цифру для успешного включения (1 или 0)");
        int on = scannerOn.nextInt();
        if (failure==on){
            counter++;
            return counter;
        } else {
            System.out.println("Ваш компьютер сгорел");
            counter = resource;
            return counter;
        }
        //scannerOn.close();
    }
    public int turnOff (){
        Random random = new Random();
        Scanner scannerOff = new Scanner(System.in);
        int counter = 0;
        int failure = random.nextInt(2);
        System.out.println("угадайте цифру для успешного выключения (1 или 0)");
        int on = scannerOff.nextInt();
        if (failure==on){
            counter++;
            return counter;
        } else {
            System.out.println("Ваш компьютер сгорел");
            counter = resource;
            return counter;
        }
        //scannerOff.close();
    }
}
