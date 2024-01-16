package models.persons;

import enums.Feellings;
import enums.Profession;
import interfaces.Sayable;

public abstract class Person {
    private String name;
    private Profession profession;

    private Feellings feellings;

    public Person(String name, Profession profession) {
        this.name = name;
        this.profession = Profession.UNKNOWN;
        feellings = Feellings.NOTHING;
    }


    public void speak(String words) {
        System.out.printf("%s говорит, \"%s\"", name, words);
    }

    public Feellings getFeellings(){return feellings;}
    public void setFeellings(Feellings feellings) { this.feellings = Feellings.NOTHING; }
    public void laugh () {
        setFeellings(Feellings.HAPPY);
        System.out.printf(name + " смеется.");
    }
    void speakto(String words) {System.out.printf("%s говорит: %s\n",name , words);}


    public void think(String thoughts) {
        setFeellings(Feellings.SAD);
        System.out.printf(" думает, \n", thoughts);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Profession getProfession(){return profession;}
    public void setProfession() {
        this.profession = Profession.UNKNOWN;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
