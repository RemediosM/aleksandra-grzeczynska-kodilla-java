package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving task", drivingTask.getTaskName());
        Assert.assertEquals("Execute driving task", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting task", paintingTask.getTaskName());
        Assert.assertEquals("Execute painting task", paintingTask.executeTask());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task", shoppingTask.getTaskName());
        Assert.assertEquals("Execute shopping task", shoppingTask.executeTask());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
}
