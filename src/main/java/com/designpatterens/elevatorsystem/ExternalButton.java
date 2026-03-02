package com.designpatterens.elevatorsystem;

class ExternalButton {
    private ExternalButtonDispatcher objDispatcher;

    public ExternalButton(ExternalButtonDispatcher dispatcher) {
        this.objDispatcher = dispatcher;
    }

    public void pressButton(Direction direction) {
        System.out.println("[ExternalButton] Button pressed: " + direction);
        objDispatcher.submitJob(direction);
    }
}