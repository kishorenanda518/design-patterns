package com.designpatterens.elevatorsystem;

class Elevator {
    private Direction direction;
    private Status statusObj;
    private InternalButton internalButton;
    private Display displayObj;
    private int currentFloor;

    public Elevator(int startFloor) {
        this.currentFloor = startFloor;
        this.statusObj = Status.IDLE;
        this.direction = Direction.UP;
        this.displayObj = new Display(startFloor, Direction.UP);
    }

    public void setInternalButton(InternalButton btn) {
        this.internalButton = btn;
    }

    public void move(int destFloor, Direction direction) {
        this.statusObj = Status.MOVING;
        this.direction = direction;
        System.out.println("[Elevator] Moving from floor " + currentFloor + " to floor " + destFloor + " going " + direction);
        this.currentFloor = destFloor;
        this.displayObj.update(currentFloor, direction);
        this.statusObj = Status.IDLE;
        System.out.println("[Elevator] Arrived at floor " + currentFloor + ". Status: IDLE");
    }

    public int getCurrentFloor() { return currentFloor; }
    public Status getStatus() { return statusObj; }
    public Direction getDirection() { return direction; }
    public Display getDisplay() { return displayObj; }
    public InternalButton getInternalButton() { return internalButton; }
}