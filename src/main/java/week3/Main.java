package week3;

import week3.db.DbConnect;
import week3.ds.DataStructures;
import week3.enums.TaskStatus;
import week3.model.TaskItem;

public class Main {
    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures(); // ovako se namjesta instanca

        System.out.println("All tasks");
        dataStructures.getAllTasks().forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        System.out.println("Tasks in progress");
        dataStructures.getByStatus(TaskStatus.IN_PROGRESS).forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        System.out.println("Task where id >= 2");
        dataStructures.findTaskById(2).forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        System.out.println("Task description");
        dataStructures.printTaskDescriptions();
        System.out.println();

        DbConnect dbConnect = new DbConnect();

        System.out.println("All tasks");
        dbConnect.getAllTaskFromDatabase().forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        System.out.println("Tasks where id == 2");
        TaskItem taskFromDb = dbConnect.getTaskById(2);
        if (taskFromDb != null) {
            System.out.println(taskFromDb.getTaskDescription());
        } else {
            System.out.println("Task Not Found");
        }


    }

}
