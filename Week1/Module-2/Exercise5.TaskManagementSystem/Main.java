public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Fix bugs", "In Progress"));
        manager.addTask(new Task(3, "Deploy to server", "Not Started"));

        manager.displayTasks();

        System.out.println("\n Searching for Task ID 2:");
        Task found = manager.searchTask(2);
        if (found != null) found.display();
        else System.out.println("Task not found.");

        System.out.println("\nDeleting Task ID 2:");
        manager.deleteTask(2);

        manager.displayTasks();
    }
}
