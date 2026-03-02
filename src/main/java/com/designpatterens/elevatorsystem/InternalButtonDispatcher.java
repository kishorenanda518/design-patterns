package com.designpatterens.elevatorsystem;

class InternalButtonDispatcher {
    private ElevatorController elevatorControllerObj;

    public InternalButtonDispatcher(ElevatorController controller) {
        this.elevatorControllerObj = controller;
    }

    public void submitJob(int floor, Direction direction) {
        System.out.println("[InternalButtonDispatcher] Request for floor: " + floor + " direction: " + direction);
        elevatorControllerObj.acceptNewRequest(floor, direction);
    }
}
