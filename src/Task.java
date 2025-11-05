public class Task {
    String id = "0";
    String description;
    String status;
    String createdAt;
    String updatedAt;
    static int totalTasks = 0;

    Task(String description, String status, String createdAt, String updatedAt) {
        totalTasks++;
        this.id = String.valueOf(totalTasks);
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return String.format(
                "Task{id='%s', description='%s', status='%s', createdAt='%s', updatedAt='%s'}",
                id, description, status, createdAt, updatedAt
        );
    }


}
