package week3.db;

import week3.enums.TaskStatus;
import week3.model.TaskItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "bvbreus11";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<TaskItem> getAllTaskFromDatabase() {
        List<TaskItem> tasksFromDataBase = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ;
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks");

            while (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                TaskStatus taskStatus = TaskStatus.valueOf(taskStatusStr);

                TaskItem task = new TaskItem(taskId, taskDescription, taskStatus);
                tasksFromDataBase.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasksFromDataBase;
    }

    public TaskItem getTaskById(int taskId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tasks WHERE id = ?");
            preparedStatement.setInt(1, taskId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                TaskStatus taskStatus = TaskStatus.valueOf(taskStatusStr);

                return new TaskItem(taskId, taskDescription, taskStatus);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}

