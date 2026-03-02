package com.designpatterens.elevatorsystem;

public class Display {
    private int floorId;
    private Direction direction;

    public Display(int floorId, Direction direction) {
        this.floorId = floorId;
        this.direction = direction;
    }

    public void update(int floorId,Direction direction){
        this.floorId = floorId;
        this.direction = direction;
        System.out.println("[Dispaly] Floor:"+floorId +"|Direction: "+direction);
    }

    public int getFloorId() {
        return floorId;
    }
    public Direction getDirection(){
        return direction;
    }
}
