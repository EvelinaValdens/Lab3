package models.other;

import exceptions.SpeakException;
import interfaces.Sayable;
import models.persons.Person;

public class Mobilephone {
    void ring(Person person1, String[] speech1, Person person2, String[] speech2) throws SpeakException {
        if (person1 instanceof Sayable personSayable1 && person2 instanceof Sayable personSayable2) {
            int maxLength = Math.min(speech1.length, speech2.length);
            for (int i = 0; i < maxLength; i++){
                personSayable1.speakto(person2, speech1[i]);
                personSayable2.speakto(person1, speech2[i]);
            }
        }
        else {
            throw new SpeakException("Вы передали метод call: %s, person1:%s, не может приянть звонок%s ");
        }
    }
}
