package com.designpatterens.parkinglot;

import java.util.ArrayList;
import java.util.List;

//Use the Strategy Pattern — make ParkingSpotManager an abstract class with concrete implementations per vehicle type.

public abstract  class ParkingSpotManager {
    protected List<ParkingSpot> spots = new ArrayList<>();

    public ParkingSpot findParkingSpace() {
        for (ParkingSpot spot : spots) {
            if (spot.isEmpty())
                return spot;
        }
        return null;
    }

    public void addParkingSpace(ParkingSpot parkingSpot) {
        spots.add(parkingSpot);
    }

    public void removeParkingSpace(ParkingSpot spot) {
        spots.remove(spot);
    }

    public class TwoWheelerManager extends ParkingSpotManager {
        public TwoWheelerManager() {
            // initialize two-wheeler spots
            for (int i = 1; i <= 10; i++) spots.add(new ParkingSpot(i, 10));
        }

        public class FourWheelerManager extends ParkingSpotManager {
            public FourWheelerManager() {
                for (int i = 11; i <= 20; i++) spots.add(new ParkingSpot(i, 40));
            }
        }

    }
}
