package models.persons;

import enums.Feellings;
import enums.Profession;
import exceptions.NoEmptySpaces;
import interfaces.MoveAction;
import models.other.University;
import models.vechicles.Car;

public class Louis extends Person {
    public Louis(String name, Profession profession) {super(name, profession);}

    public void driveCar(Car car, University university) {
        System.out.println(getName() + " ведет " + car.getModel() + " в сторону " + university + ".");
        car.start();
    }

    public void listenToMusic(String song) {
        setFeellings(Feellings.VERYHAPPY);
        System.out.println(getName() + " прибавил звук и запел " + song + " плохо, но с большим удовольствием.");
    }

    public Louis kiss(Person person) {
        setFeellings(Feellings.HAPPY);
        System.out.printf(getName() + " целует " + person.getName());
        return this;
    }

    public static void main(String[] args) {
        boolean louiskissesRachel = true;
        if (louiskissesRachel) {
            System.out.println("Louis is happy when he kisses Rachel");
        }
    }
    public Louis leaves(){
        setFeellings(Feellings.ASTONISHMENT);
        System.out.println(getName() + " выходит.");
        return this;
    }

    public void getIntoCar(Car car) throws NoEmptySpaces {
        if (car.isEmptySpace(this)){
            System.out.println("Он залез в " + car.getModel() + " которую они получили от университета и выехал на дорогу.");
            MoveAction moveToUniversity = destination -> System.out.printf("Едет в сторону " + destination);
            moveToUniversity.move("университет.");
        } else {
            throw new NoEmptySpaces("В машине не оказалось свободных мест. Он взял другую свободную.");
        }
    }
    public void reflects(String reflects) {
        System.out.println(getName() + " размышляет: \""+ reflects + "\"");
    }

    public University noticeAndDriveToUniversity(University university) {
        System.out.println("Первое, что он заметил, подъехав к " + university.getName() + ":");
        return university;
    }
    public Louis brakeHard() {
        System.out.println(getName() + " резко затормозил, чтобы пропустить два последних, мчащихся от Дунн-холла.");
        return this;
    }
    public Louis continueDriving() {
        System.out.printf(getName() + " , вздохнув, поехал дальше.");
        return this;
    }

}