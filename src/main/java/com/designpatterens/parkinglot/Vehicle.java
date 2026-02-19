package com.designpatterens.parkinglot;

public abstract class Vehicle {
    int vehicleNo;
    VehicleType vehicleType;

    public abstract int getPrice();

    public class TwoWheeler extends Vehicle {
        public TwoWheeler(int vehicleNo) {
            this.vehicleNo = vehicleNo;
            this.vehicleType = VehicleType.TWO_WHEELER;
        }

        @Override
        public int getPrice() { return 10; }
    }

    public class FourWheeler extends Vehicle{
        public FourWheeler(int vehicleNo){
            this.vehicleNo = vehicleNo;
            this.vehicleType = VehicleType.FOUR_WHEELER;
        }

        @Override
        public int getPrice(){
            return 20;
        }
    }

}

