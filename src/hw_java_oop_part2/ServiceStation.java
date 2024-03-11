package hw_java_oop_part2;

public class ServiceStation {
    public static void check(Transport vehicle) {
        if (vehicle == null) {
            return;
        }

        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof Car) {
            ((Car) vehicle).checkEngine();
        }

        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }
    }
}
