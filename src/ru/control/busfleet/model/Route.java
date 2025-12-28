package ru.control.busfleet.model;

public class Route {

    private int RouteNumber;

    private String StartPoint;

    private String FinishPoint;

    private int NumStops;

    private int TravelTime;

    private int Distance;

    public int getRouteNumber() {
        return RouteNumber;
    }

    public void setRouteNumber(int routeNumber) {
        RouteNumber = routeNumber;
    }

    public String getStartPoint() {
        return StartPoint;
    }

    public void setStartPoint(String startPoint) {
        StartPoint = startPoint;
    }

    public String getFinishPoint() {
        return FinishPoint;
    }

    public void setFinishPoint(String finishPoint) {
        FinishPoint = finishPoint;
    }

    public int getNumStops() {
        return NumStops;
    }

    public void setNumStops(int numStops) {
        NumStops = numStops;
    }

    public int getTravelTime() {
        return TravelTime;
    }

    public void setTravelTime(int travelTime) {
        TravelTime = travelTime;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }
}
