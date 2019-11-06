package adapterPattern;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating...");
    }
}
