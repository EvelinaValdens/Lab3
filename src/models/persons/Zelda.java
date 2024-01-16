package models.persons;

import enums.Profession;

public class Zelda extends Person{
    public Zelda(String name, Profession profession) {
        super(name, profession);
    }

    public void haunt(Louis louis) {
        System.out.printf(getName() + " все еще сидит в " + louis.getName() + ".");
    }
}
