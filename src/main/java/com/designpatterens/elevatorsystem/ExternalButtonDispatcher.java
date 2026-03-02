package com.designpatterens.elevatorsystem;

import java.util.ArrayList;
import java.util.List;

public class ExternalButtonDispatcher {
    private List<ElevatorController> elevatorControllers = new ArrayList<>();
    private DispatchAlgorithm algorithm;

    public ExternalButtonDispatcher(DispatchAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void addController(ElevatorController controller) {
        elevatorControllers.add(controller);
    }
    public void submitJob(Direction direction) {
        System.out.println("[ExternalButtonDispatcher] Job submitted for direction: " + direction);
        algorithm.process();
        // Simple dispatch: assign to first IDLE elevator
        for (ElevatorController controller : elevatorControllers) {
            if (controller.getElevator().getStatus() == Status.IDLE) {
                controller.acceptNewRequest(controller.getElevator().getCurrentFloor(), direction);
                return;
            }
        }
        System.out.println("[ExternalButtonDispatcher] No idle elevator found.");
    }
}
