package com.designpatterens.elevatorsystem;

public class ElevatorSystem {
    public static void main(String[] args) {
        System.out.println("=== Elevator System Starting ===\n");

        // 1. Create elevators
        Elevator elevator1 = new Elevator(0);
        Elevator elevator2 = new Elevator(5);

        // 2. Create controllers
        ElevatorController controller1 = new ElevatorController(elevator1);
        ElevatorController controller2 = new ElevatorController(elevator2);

        // 3. Set up internal buttons for each elevator
        InternalButtonDispatcher intDispatcher1 = new InternalButtonDispatcher(controller1);
        InternalButton intBtn1 = new InternalButton(intDispatcher1);
        elevator1.setInternalButton(intBtn1);

        InternalButtonDispatcher intDispatcher2 = new InternalButtonDispatcher(controller2);
        InternalButton intBtn2 = new InternalButton(intDispatcher2);
        elevator2.setInternalButton(intBtn2);

        // 4. Create external dispatcher with chosen algorithm
        ExternalButtonDispatcher extDispatcher = new ExternalButtonDispatcher(new MinimumSeekTime());
        extDispatcher.addController(controller1);
        extDispatcher.addController(controller2);

        // 5. Build the building with floors
        Building building = new Building();
        for (int i = 0; i < 10; i++) {
            building.addFloor(new Floor(i, extDispatcher));
        }

        System.out.println("--- External Button Press (Floor 3, Going UP) ---");
        building.getFloor(3).getExternalButton().pressButton(Direction.UP);

        System.out.println("\n--- External Button Press (Floor 7, Going DOWN) ---");
        building.getFloor(7).getExternalButton().pressButton(Direction.DOWN);

        System.out.println("\n--- Internal Button Press (Elevator 1, going to Floor 9) ---");
        elevator1.getInternalButton().pressButton(9, Direction.UP);

        System.out.println("\n=== Elevator System Done ===");
    }
}