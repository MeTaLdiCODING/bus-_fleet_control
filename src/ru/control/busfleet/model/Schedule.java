package ru.control.busfleet.model;

public class Schedule {

    private Stop StopName;

    private Route RouteNumber;

    private String ArrivalTime;

    private String DepartureTime;

    public Stop getStopName() {
        return StopName;
    }

    public void setStopName(Stop stopName) {
        StopName = stopName;
    }

    public Route getRouteNumber() {
        return RouteNumber;
    }

    public void setRouteNumber(Route routeNumber) {
        RouteNumber = routeNumber;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }
}
