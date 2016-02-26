/**
 * Created by crhonek on 26.2.2016.
 */
public class Main {

    public static void main(String[] args) {
        IVehicleFactory vehicleFactory = new SeeVehicleFactory();
        Vehicle smallVehicle = vehicleFactory.createSmallVehicle();
        System.out.println(smallVehicle);
        Vehicle largeVehicle = vehicleFactory.createLargeVehicle();
        System.out.println(largeVehicle);
    }
}
