import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    static final String filePath = "tasks.json";

    void loadFromFile() {
        String[] tasksObj = getStrings();

        for (String obj : tasksObj) {
            obj = obj.replace("{", "").replace("}", "");

            String[] pairs = obj.split(",");
            String description = "", status = "", createdAt = "", updatedAt = "";

            for (String pair : pairs) {
                String[] kv = pair.split(":", 2);
                String key = kv[0].replace("\"", "").trim();
                String value = kv[1].replace("\"", "").trim();

                switch (key) {
                    case "description":
                        description = value;
                        break;
                    case "status":
                        status = value;
                        break;
                    case "createdAt":
                        createdAt = value;
                        break;
                    case "updatedAt":
                        updatedAt = value;
                        break;
                }
            }
            tasks.add(new Task(description, status, createdAt, updatedAt));
        }

    }

    private static String[] getStrings() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String tasksStr = sb.toString();

        tasksStr = tasksStr.trim();
        if (tasksStr.startsWith("[")) tasksStr = tasksStr.substring(1);
        if (tasksStr.endsWith("]")) tasksStr = tasksStr.substring(0, tasksStr.length() - 1);

        return tasksStr.split("},\\s*\\{");
    }

    void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tasks.toArray().length; i++) {
                if (sb.isEmpty()) sb.append("[\n");
                Task task = tasks.get(i);
                String id = task.id, desc = task.description, status = task.status, createdAt = task.createdAt, updatedAt = task.updatedAt;
                String line = "\t{\"id\":\"" + id + "\",\"description\":\"" + desc + "\",\"status\":\"" + status + "\",\"createdAt\":\"" + createdAt + "\",\"updatedAt\":\"" + updatedAt + "\"}";
                sb.append(line);
                if (i != tasks.toArray().length - 1) sb.append(",\n");
                if (i == tasks.toArray().length - 1) sb.append("\n]");
            }
            writer.write(sb.toString());
        } catch (IOException e) {
            System.out.println("IO Exception!");
        }
    }

    void addTask(Task task) {
        tasks.add(task);
        saveToFile();
    }

    void deleteTask(String id) {
    }

    void updateTask(String id, String newDesc, String newStatus) {

    }

    void listAll() {

    }

    void listDone() {

    }

    void listTodo() {

    }

    void listInProgress() {

    }

    List<Task> getTasks() {
        return this.tasks;
    }
}
