package models.persons;

import enums.Feellings;
import enums.Profession;

public class Doctor extends Person {
    public Doctor(String name, Profession profession) {
        super(name, profession);
    }
    public void shareWisdom(String wisdom) {
        setFeellings(Feellings.NOTHING);
        System.out.printf("getName():%s,  делится своими знаниями:%s, wisdom:%s");
    }

    public static class ProfessionalLife {
        public static void reflectOnMedicalKnowledge() {
            System.out.printf("Медицинские знания: Смерть так же естественна, как рождение.");
        }

    }
    public class PersonalMemories {
        private String memory;

        public PersonalMemories(String memory) {
            setFeellings(Feellings.MOODSTAYCALM);
            this.memory = memory;
        }


    }
}
