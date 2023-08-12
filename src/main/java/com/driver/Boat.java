package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;
    @Override
    public String getVehicleName() {
        this.name="Udantastri";
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        this.capacity=50;
        return this.capacity;
    }
}
