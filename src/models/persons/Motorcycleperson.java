package models.persons;

import enums.Profession;
import models.vechicles.Motorcycle;

public class Motorcycleperson extends Person{
    private Motorcycle[] persons;
    public Motorcycleperson(String name, Profession profession) {
        super(name, profession);
    }
    public static void drivemotocycle (Motorcycle motorcycle){
    }
    public static void wave(Person person) {
        System.out.printf("Мотоциклист помахал " + person.getName() + ", даже не оглянувшись.");
    }
    public static void wave() {
    }
}
