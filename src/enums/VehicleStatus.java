package enums;

public enum VehicleStatus {
    ENGINE_ON("Двигатель заведен"),
    ENGINE_OFF("Двигатель заглушен"),
    MOVING("Движется"),
    STOPPED("Остановлен"),
    PARKED("Припаркован");

    private final String description;

    VehicleStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
