import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.loadFromFile();
        List<Task> tasks = manager.getTasks();
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
        manager.addTask(new Task("Hello world7", "todo", "12:12:12", "N/A"));
//        if (args.length == 0) {
//            System.out.println("Usage: java Main add|delete|update|list ...");
//            return;
//        }
//
//        String command = args[0];
//        switch (command) {
//            case "add":
//                manager.addTask(new Task("1", "2", "3", "4", "5"));
//                break;
//            case "delete":
//                manager.deleteTask("2");
//                break;
//            case "update":
//                manager.updateTask("2", "45", "done");
//                break;
//            case "list":
//                manager.listAll();
//                break;
//            default:
//                System.out.println("Unknown command!");
//        }
    }


}
