/**
 * Created by crhonek on 26.2.2016.
 */
public class SeeVehicleFactory implements IVehicleFactory {
    @Override
    public Vehicle createSmallVehicle() {
        return new Boat();
    }

    @Override
    public Vehicle createLargeVehicle() {
        return new Ferry();
    }
}
