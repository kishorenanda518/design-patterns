package com.designpatterens.parkinglot;

public class EntranceGate {
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public EntranceGate(ParkingSpotManager parkingSpotManager, Ticket ticket) {
        this.parkingSpotManager = parkingSpotManager;
        this.ticket = ticket;
    }

    public void findSpace(Vehicle vehicle){
        parkingSpotManager.findParkingSpace();
    }
    public void bookSpot(ParkingSpot parkingSpot){
        parkingSpotManager.addParkingSpace(parkingSpot);
    }
    public void generateTicket(Vehicle vehicle){
        ticket.generateTicket(vehicle);
    }
}
