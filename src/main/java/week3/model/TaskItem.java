package week3.model;

import week3.enums.TaskStatus;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private TaskStatus taskStatus;

    public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    // Getters and setters for each attribute
    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
}
