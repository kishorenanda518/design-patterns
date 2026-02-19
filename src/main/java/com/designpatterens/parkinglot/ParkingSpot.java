package com.designpatterens.parkinglot;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }

    public ParkingSpot(int i, int i1) {
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
        System.out.println("Vehicle parked at spot " + id);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        this.isEmpty = true;
        System.out.println("Vehicle removed from spot " + id);
    }
    public boolean isEmpty() { return isEmpty; }
    public int getId() { return id; }
}
