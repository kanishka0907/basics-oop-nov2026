package inheritance.examples;

public class MainInheritance {
    public static void main(String[] args){
        System.out.println("-----Vehicle Parent Class-----");
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();

        System.out.println("-----AirVehicle Parent Class-----");
        AirVehicle airvehicle = new AirVehicle();
        airvehicle.start();
        airvehicle.stop();
        airvehicle.fuel();

        System.out.println("-----WaterVehicle Parent Class-----");
        WaterVehicle watervehicle = new WaterVehicle();
        watervehicle.start();
        watervehicle.stop();
        watervehicle.fuel();

        System.out.println("-----RoadVehicle Parent Class-----");
        RoadVehicle roadvehicle = new RoadVehicle();
        roadvehicle.start();
        roadvehicle.stop();
        roadvehicle.fuel();
    }
}
