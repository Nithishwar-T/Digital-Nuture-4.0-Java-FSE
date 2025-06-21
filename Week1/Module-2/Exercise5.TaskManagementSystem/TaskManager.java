public class TaskManager {
    private TaskNode head;

    
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    
    public Task searchTask(int id) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.taskId == id) return temp.task;
            temp = temp.next;
        }
        return null;
    }

   
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        System.out.println("Task List:");
        TaskNode temp = head;
        while (temp != null) {
            temp.task.display();
            temp = temp.next;
        }
    }

    //            
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task ID " + id + " deleted.");
            return;
        }

        TaskNode current = head;
        TaskNode previous = null;

        while (current != null && current.task.taskId != id) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            previous.next = current.next;
            System.out.println("Task ID " + id + " deleted.");
        }
    }
}
