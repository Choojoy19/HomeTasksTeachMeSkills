package lesson7;

public abstract class LandTransport extends Transport {
    private int countWheel;
    private double fuelConsumption;

    public LandTransport (){

    }

    public LandTransport(int power,int maxSpeed, int weight, String brand, int countWheel, double fuelConsumption ){
        super (power,maxSpeed,weight,brand);
        this.countWheel = countWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(int countWheel) {
        this.countWheel = countWheel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
