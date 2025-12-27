package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.Qualification;

public class Driver extends Staff{

    private byte DriverLicenseNumber;

    private Qualification Driverqualification;

    public byte getDriverLicenseNumber() {
        return DriverLicenseNumber;
    }

    public void setDriverLicenseNumber(byte driverLicenseNumber) {
        DriverLicenseNumber = driverLicenseNumber;
    }

    public Qualification getQualification() {
        return Driverqualification;
    }

    public void setQualification(Qualification qualification) {
        this.Driverqualification = qualification;
    }
}
