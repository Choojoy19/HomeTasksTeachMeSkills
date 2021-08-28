package lesson7;

public class Car extends LandTransport {
    private String bodyType;
    private int passengerCount;

    public Car (){

    }

    public Car (int power,int maxSpeed,int weight,String brand,int countWheel, double fuelConsumption, String bodyType, int passengerCount){
        super(power,maxSpeed,weight,brand,countWheel,fuelConsumption);
        this.bodyType = bodyType;
        this.passengerCount = passengerCount;
    }

    public void display (){
        System.out.printf("Total info:\n Power: %.2f kW;\n Max speed: %d km/h;\n Weight: %d kg;\n Brand: %s;\n Wheels: %d;\n Consumption: %.2f l/h;\n Type: %s;\n Count of passengers: %d.",this.countPower(),this.getMaxSpeed(),this.getWeight(),this.getBrand(),this.getCountWheel(),this.getFuelConsumption(),this.bodyType,this.passengerCount );
    }

    public double countPower (){
       double power = this.getPower()*0.74;
        return power;
    }

}
