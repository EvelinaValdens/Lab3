package enums;

public enum Profession {
    VETERINAR("Ветеринар"),
    UNKNOWN("неизвестно");

    private final String description;

    Profession(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
