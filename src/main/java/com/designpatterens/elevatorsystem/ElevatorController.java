package com.designpatterens.elevatorsystem;

class ElevatorController {
    private Elevator objElevator;

    public ElevatorController(Elevator elevator) {
        this.objElevator = elevator;
    }

    public void acceptNewRequest(int floor, Direction direction) {
        System.out.println("[ElevatorController] Accepted request: floor=" + floor + ", direction=" + direction);
        objElevator.move(floor, direction);
    }

    public Elevator getElevator() {
        return objElevator;
    }
}