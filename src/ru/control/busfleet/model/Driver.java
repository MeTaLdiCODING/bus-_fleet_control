package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.Qualification;

public class Driver extends Staff{

    private String DriverLicenseNumber;

    private Qualification Driverqualification;

    public String getDriverLicenseNumber() {
        return DriverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        DriverLicenseNumber = driverLicenseNumber;
    }

    public Qualification getQualification() {
        return Driverqualification;
    }

    public void setQualification(Qualification qualification) {
        this.Driverqualification = qualification;
    }
}
