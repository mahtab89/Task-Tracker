import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.loadFromFile();
        List<Task> tasks = manager.getTasks();
        if (args.length == 0) {
            System.out.println("Usage: java Main add|delete|update|list ...");
            return;
        }
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM;yyyy HH:mm:ss");
        String time = currentTime.format(formatter);

        String command = args[0];
        switch (command) {
            case "add":
                manager.addTask(new Task(args[1], "todo", time, "N/A"));
                System.out.println("Task added successfully!");
                break;
            case "delete":
                manager.deleteTask(args[1]);
                break;
            case "update":
                manager.updateTask(args[1], args[2], time);
                break;
            case "mark-in-progress":
                manager.markInProgress(args[1], time);
                break;
            case "mark-done":
                manager.markDone(args[1], time);
                break;
            case "listAll":
                manager.listAll();
                break;
            case "listDone":
                manager.listDone();
                break;
            case "listTodo":
                manager.listTodo();
                break;
            case "listInProgress":
                manager.listInProgress();
                break;
            default:
                System.out.println("Unknown command!");
        }
    }


}
