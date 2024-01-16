package models.vechicles;

import enums.VehicleStatus;

public class Bicycle extends Vehicle {
    public Bicycle(String model) {
        super(model, VehicleStatus.STOPPED);
    }

    @Override
    public void start() {
        System.out.println("Велосипед " + model + " в движении.");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед " + model + " остановился.");
    }
}
