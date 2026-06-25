public class TaskTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Complete Java Assignment", "Pending"));
        taskList.addTask(new Task(2, "Prepare for Exam", "In Progress"));
        taskList.addTask(new Task(3, "Submit Lab Record", "Completed"));

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTask(1);

        System.out.println("\nTasks after deletion:");
        taskList.displayTasks();
    }
}