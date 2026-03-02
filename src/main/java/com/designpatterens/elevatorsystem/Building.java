package com.designpatterens.elevatorsystem;

import java.util.ArrayList;
import java.util.List;

class Building {
    private List<Floor> floors = new ArrayList<>();

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public List<Floor> getFloors() { return floors; }

    public Floor getFloor(int index) { return floors.get(index); }
}