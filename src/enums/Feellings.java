package enums;

public enum Feellings {
    HAPPY("настроение поднимается"),
    SAD("настроение опускается"),
    MOODSTAYCALM("настроение осталось прежним"),
    NOTHING("ничего не чувствует"),
    ASTONISHMENT("удивление"),
    VERYHAPPY("с большим удовольствием");

    private final String description;

    Feellings(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
