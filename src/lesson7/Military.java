package lesson7;

public class Military extends AirTransport {
    private boolean bailout;
    private int countRocket;

    public Military(){

    }

    public Military (int power,int maxSpeed, int weight, String brand, int wingSpan, int runwayLength, boolean bailout, int countRocket){
        super(power,maxSpeed,weight,brand,wingSpan,runwayLength);
        this.bailout = bailout;
        this.countRocket = countRocket;
    }

    public void display (){
        System.out.printf("Total info:\n Power: %.2f kW;\n Max speed: %d km/h;\n Weight: %d kg;\n Brand: %s;\n Wingsspan: %d;\n Runway length: %d;\n Bailout: %b;\n Count of rockets: %d",this.countPower(),this.getMaxSpeed(),this.getWeight(),this.getBrand(),this.getWingSpan(),this.getRunwayLength(),this.bailout, this.countRocket );
    }

    public double countPower (){
        double power = this.getPower()*0.74;
        return power;
    }
}
