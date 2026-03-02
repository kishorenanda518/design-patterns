package com.designpatterens.elevatorsystem;

class Floor {
    private int floorId;
    private Direction direction;
    private Display display;
    private ExternalButton externalButton;

    public Floor(int floorId, ExternalButtonDispatcher dispatcher) {
        this.floorId = floorId;
        this.direction = Direction.UP;
        this.display = new Display(floorId, direction);
        this.externalButton = new ExternalButton(dispatcher);
    }

    public ExternalButton getExternalButton() { return externalButton; }
    public Display getDisplay() { return display; }
    public int getFloorId() { return floorId; }
}