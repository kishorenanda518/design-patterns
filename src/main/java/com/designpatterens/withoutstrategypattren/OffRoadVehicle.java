package com.designpatterens.withoutstrategypattren;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive(){
        System.out.println("Sports drive capability "); // here sport vehicle and off road vehicle having same logic,
        // but we are duplicating same code
    }
}
