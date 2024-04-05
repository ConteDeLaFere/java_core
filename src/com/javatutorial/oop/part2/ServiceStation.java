package com.javatutorial.oop.part2;

public class ServiceStation {
    public void check(Transportable vehicle) {
        if (vehicle != null) {
            vehicle.service();
        }
    }
}
