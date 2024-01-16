package models.persons;

import enums.Profession;
import interfaces.Sayable;
import models.animals.Animal;

import java.util.ArrayList;

public class Rachel extends Person implements Sayable {
    ArrayList<String> speech ;
    {speech = new ArrayList<>();}
    private Animal animal;
    public Rachel(String name, Profession profession, Animal animal) {
        super(name, profession);
        this.animal = animal;
    }

    public void callVeterinarian(Veterinarian veterinarian) {
        System.out.printf(getName() + " должна была позвонить ветеринару, договориться насчет " + animal.getName());
        veterinarian.scheduleAppointment(animal);
    }

    public Animal getAnimal() {
        return animal;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    @Override
    public void speakto(Person person, String talk) {
        speech.add(talk);

    }
}