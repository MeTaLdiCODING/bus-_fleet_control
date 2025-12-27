package ru.control.busfleet.model;

import ru.control.busfleet.model.enumiration.BusFleet;

public class Admin extends Staff{

    private BusFleet AdminBusFleet;

    public BusFleet getAdminBusFleet() {
        return AdminBusFleet;
    }

    public void setAdminBusFleet(BusFleet adminBusFleet) {
        AdminBusFleet = adminBusFleet;
    }
}
