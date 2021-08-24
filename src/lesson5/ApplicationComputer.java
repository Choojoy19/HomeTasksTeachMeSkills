package lesson5;

public class ApplicationComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(3000);
        computer.setHdd(1000);
        computer.setRam(2048);
        computer.setResource(8);
        int resource = computer.getResource();
        int counter = 0;
        while (counter<=resource) {
            counter = computer.turnOn();
            if (counter != resource) {
                counter += computer.turnOff();
            } else {
                break;
            }
        }

    }
}
