package enums;

public enum WeatherStatus {
    CLEAR("чисто"),
    CLOUDY("облачно"),
    RAINY("дождливо"),
    WINDY("ветренно"),
    SNOWY("снежно");

    private final String description;

    WeatherStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
