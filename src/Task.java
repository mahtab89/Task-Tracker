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
        return String.format("Id: '%s' | Task: '%s' | Status: '%s' | Created At: '%s' | Updated At: '%s'", this.id, this.description, this.status, this.createdAt, this.updatedAt);
    }


}
