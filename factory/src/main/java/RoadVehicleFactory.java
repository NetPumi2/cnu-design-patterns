/**
 * Created by crhonek on 26.2.2016.
 */
public class RoadVehicleFactory implements IVehicleFactory {
    @Override
    public Vehicle createSmallVehicle() {
        return new Car();
    }

    @Override
    public Vehicle createLargeVehicle() {
        return new Truck();
    }
}
