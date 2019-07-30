package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList inProgres = board.getInProgressList();
        inProgres.add("task1");
        TaskList toDo = board.getToDoList();
        toDo.add("task2");
        TaskList done = board.getDoneList();
        done.add("task3");
        //Then
        System.out.println("Task in progress: " + board.getInProgressList() + "\nTask to do: " + board.getToDoList() + "\nDone task: " + board.getDoneList());
        Assert.assertEquals("task1", board.getInProgressList().getTask(0));
        Assert.assertEquals("task2", board.getToDoList().getTask(0));
        Assert.assertEquals("task3", board.getDoneList().getTask(0));
    }
}
