package models.other;

public class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void displayActivity() {
        System.out.println("У " + name + ", было непривычно оживленное движение. Машины, велосипеды, мотоциклы.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
