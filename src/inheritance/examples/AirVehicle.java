package inheritance.examples;

public class AirVehicle extends Vehicle{
    public void travelsOnAir(){
        super.color="green";
        System.out.println("Travels on Air");
    }
    @Override
    public void start(){
        System.out.println("AirVehicle stared");
    }
    @Override
    public void stop(){
        System.out.println("AirVehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("AirVehicle fueled");
    }
}
