package com.designpatterens.parkinglot;

public class ExitGate {

    private ParkingSpotManager parkingSpotManager;
    private ParkingSpot parkingSpot;

    public ExitGate(ParkingSpotManager parkingSpotManager,ParkingSpot parkingSpot) {
        this.parkingSpotManager = parkingSpotManager;
        this.parkingSpot = parkingSpot;
    }

    public void exit(Vehicle vehicle,Ticket ticket){
        parkingSpotManager.removeParkingSpace(parkingSpot);
        System.out.println("Amount Paid");
    }

}
