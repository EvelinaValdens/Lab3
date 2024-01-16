package enums;

import java.util.Random;

public enum Seasons {
    SUMMER("лето"),
    AUTUMN("осень"),
    WINTER("зима"),
    SPRING("весна");

    private final String description;

    Seasons(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
    public static Seasons getRandomSeason() {
        Seasons[] seasons = Seasons.values();
        Random random = new Random();
        int randomIndex = random.nextInt(seasons.length);
        return seasons[randomIndex];
    }
}
