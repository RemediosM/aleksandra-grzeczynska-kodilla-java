package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public String getTask(int index) {
        return tasks.get(index);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
