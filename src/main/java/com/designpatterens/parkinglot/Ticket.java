package com.designpatterens.parkinglot;

public class Ticket {
    private long entryTime;
    private Vehicle vehicle;
    private int spotId;

    public Ticket generateTicket(Vehicle vehicle,int spotId){
        this.entryTime=System.currentTimeMillis();
        this.vehicle= vehicle;
        this.spotId = spotId;

        System.out.println("Ticket generated "+ entryTime);
        return this;
    }

    public long getEntryTime(){
        return  entryTime;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
