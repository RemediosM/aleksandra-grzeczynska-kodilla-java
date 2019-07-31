package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String SHOPPING = "SHOPPING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving task", "Rome","car");
            case PAINTING:
                return new PaintingTask("Painting task", "red", "dog");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "apples", 10);
            default:
                return null;
        }

    }
}
