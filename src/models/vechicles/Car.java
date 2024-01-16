package models.vechicles;

import enums.VehicleStatus;
import interfaces.MusicPlayer;
import models.persons.Person;

import java.util.Arrays;

public class Car extends Vehicle implements MusicPlayer {
    private int capacity;
    private Person[] persons;
    public Car(String model, VehicleStatus status, int capacity) {
        super(model, status);
        persons = new Person[capacity];
    }

    public Car(String model, int capacity) {
        super(model, VehicleStatus.ENGINE_OFF);
        persons = new Person[capacity];
    }
    public boolean isEmptySpace(Person person) {

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                return true;
            }
        }
        return false;
    }

    @Override
    public void start() {
        this.vehicleStatus = VehicleStatus.ENGINE_ON;
        System.out.printf(model + " " + vehicleStatus);
    }

    @Override
    public void stop() {
        this.vehicleStatus = VehicleStatus.STOPPED;
        System.out.println(model + " " + vehicleStatus);
    }

    @Override
    public void playMusic(String track) {
        if (persons[0] == null){
            System.out.printf("В машине никого нет.");
        } else {
            System.out.printf(persons[0].getName() + " включил радио. Заиграла музыка: " + track);
        }
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}