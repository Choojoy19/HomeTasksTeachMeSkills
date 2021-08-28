package lesson7;

public abstract class AirTransport extends Transport {
    private int wingSpan;
    private int runwayLength;

    public AirTransport (){

    }

    public AirTransport(int power,int maxSpeed, int weight, String brand, int wingSpan, int runwayLength ){
        super (power,maxSpeed,weight,brand);
        this.wingSpan = wingSpan;
        this.runwayLength = runwayLength;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }
}
