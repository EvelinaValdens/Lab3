package models.vechicles;

import enums.VehicleStatus;
import interfaces.Transport;

public abstract class Vehicle implements Transport {
    protected String model;
    protected VehicleStatus vehicleStatus;

    public Vehicle(String model, VehicleStatus vehicleStatus) {
        this.model = model;
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
    @Override
    public void start(){
        this.vehicleStatus = VehicleStatus.ENGINE_ON;
    }
    @Override
    public void stop(){
        this.vehicleStatus = VehicleStatus.STOPPED;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}