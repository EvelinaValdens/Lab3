package models.persons;
import enums.Feellings;
import enums.Profession;
import interfaces.Sayable;
import models.animals.Animal;

import java.util.ArrayList;

public class Veterinarian extends Person implements Sayable {
    ArrayList<String> speech ;
    {speech = new ArrayList<>();}
    public Veterinarian(String name, Profession profession) {
        super(name, profession);
    }
    public void scheduleAppointment(Animal animal) {
        System.out.printf(getName() + " назначил встречу для " + animal.getName() + ".");
        String[] speech = {"Здравствуйте"};
    }




    @Override
    public void speakto(Person person, String talk) {
        speech.add(talk);

    }
}
