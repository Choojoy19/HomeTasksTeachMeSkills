package lesson7;

public class Cargo extends LandTransport {
    private int liftingCapacity;


    public Cargo() {

    }

    public Cargo(int power, int maxSpeed, int weight, String brand, int countWheel, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, countWheel, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void display (){
        System.out.printf("Total info:\n Power: %.2f kW;\n Max speed: %d km/h;\n Weight: %d kg;\n Brand: %s;\n Wheels: %d;\n Consumption: %.2f l/h;\n Lifting capacity: %d ",this.countPower(),this.getMaxSpeed(),this.getWeight(),this.getBrand(),this.getCountWheel(),this.liftingCapacity );
    }

    public double countPower (){
        double power = this.getPower()*0.74;
        return power;
    }
}