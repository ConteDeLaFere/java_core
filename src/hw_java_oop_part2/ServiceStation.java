package hw_java_oop_part2;

public class ServiceStation {
    public void check(Transportable vehicle) {
        if (vehicle != null) {
            vehicle.service();
        }
    }
}
