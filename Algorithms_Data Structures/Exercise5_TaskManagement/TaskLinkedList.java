public class TaskLinkedList {
    private TaskNode head;

    // Add task at end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);

        if (head == null) {
            head = newNode;
            System.out.println("Task added successfully.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        System.out.println("Task added successfully.");
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;

        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }

        return null;
    }

    // Traverse / display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        // If head node itself has the task
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task deleted successfully.");
        }
    }
}