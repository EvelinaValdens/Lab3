package models.vechicles;

import enums.VehicleStatus;
import models.persons.Person;
import models.persons.Motorcycleperson;

public class Motorcycle extends Vehicle {
    private Motorcycleperson[] persons;
    public Motorcycle(String model) {
        super(model, VehicleStatus.ENGINE_OFF);
        Motorcycleperson.wave();
    }
    }
