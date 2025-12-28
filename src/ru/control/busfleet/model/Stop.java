package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.District;
import ru.control.busfleet.model.enumiration.StopName;
import ru.control.busfleet.model.enumiration.Street;

public class Stop {

    private StopName stopName;

    private District district;

    private Street street;

    public StopName getStopName() {
        return stopName;
    }

    public void setStopName(StopName stopName) {
        this.stopName = stopName;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
