package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.Status;

public class Trip {

    private  String TripDate;

    private String TripStartTime;

    private String TripEndTime;

    private Status status;

    public String getTripDate() {
        return TripDate;
    }

    public void setTripDate(String tripDate) {
        TripDate = tripDate;
    }

    public String getTripStartTime() {
        return TripStartTime;
    }

    public void setTripStartTime(String tripStartTime) {
        TripStartTime = tripStartTime;
    }

    public String getTripEndTime() {
        return TripEndTime;
    }

    public void setTripEndTime(String tripEndTime) {
        TripEndTime = tripEndTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
