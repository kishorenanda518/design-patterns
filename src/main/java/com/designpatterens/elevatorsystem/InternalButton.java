package com.designpatterens.elevatorsystem;

class InternalButton {
    private InternalButtonDispatcher objDispatcher;

    public InternalButton(InternalButtonDispatcher dispatcher) {
        this.objDispatcher = dispatcher;
    }

    public void pressButton(int button) {
        System.out.println("[InternalButton] Button pressed for floor: " + button);
        // Default direction UP for simplicity; real systems track current floor
        objDispatcher.submitJob(button, Direction.UP);
    }

    public void pressButton(int button, Direction direction) {
        System.out.println("[InternalButton] Button pressed for floor: " + button + " direction: " + direction);
        objDispatcher.submitJob(button, direction);
    }
}