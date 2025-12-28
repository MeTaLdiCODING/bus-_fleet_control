package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.BusModel;
import ru.control.busfleet.model.enumiration.BusType;

public class Bus {

    private String BusGovernmentNumber;

    private BusType busType;

    private BusModel busModel;

    private byte MaxSpeed;

     private String BusServiceStartDate;

    public String getBusGovernmentNumber() {
        return BusGovernmentNumber;
    }

    public void setBusGovernmentNumber(String busGovernmentNumber) {
        BusGovernmentNumber = busGovernmentNumber;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public BusModel getBusModel() {
        return busModel;
    }

    public void setBusModel(BusModel busModel) {
        this.busModel = busModel;
    }

    public byte getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(byte maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getBusServiceStartDate() {
        return BusServiceStartDate;
    }

    public void setBusServiceStartDate(String busServiceStartDate) {
        BusServiceStartDate = busServiceStartDate;
    }
}
