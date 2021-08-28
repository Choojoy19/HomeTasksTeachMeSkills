package lesson7;

public class Civil extends AirTransport {
    private int countPassengers;
    private boolean businessClass;

    public Civil (){

    }

    public Civil (int power,int maxSpeed,int weight,String brand,int wingSpan, int runwayLength, int countPassengers, boolean businessClass){
        super(power,maxSpeed,weight,brand,wingSpan,runwayLength);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }

    public void display (){
        System.out.printf("Total info:\n Power: %.2f kW;\n Max speed: %d km/h;\n Weight: %d kg;\n Brand: %s;\n Wingsspan: %d;\n Runway length: %d;\n Count of passengers: %d;\n Business class: %b",this.countPower(),this.getMaxSpeed(),this.getWeight(),this.getBrand(),this.getWingSpan(),this.getRunwayLength(),this.countPassengers, this.businessClass );
    }
    public double countPower (){
        double power = this.getPower()*0.74;
        return power;
    }
}
