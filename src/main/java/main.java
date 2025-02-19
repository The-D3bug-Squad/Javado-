import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark task as completed");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            choice = manager.processMenuChoice(choice);

            scanner.nextLine(); // Consume newline



            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    if (title.isBlank()) {
                        System.out.println("Please enter a valid task title");
                        continue;
                    }
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(title, description, false);
                    manager.addTask(task);
                    break;
                case 2:
                    List<Task> tasks = manager.listTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("There are no tasks");
                    } else {
                        System.out.println("Tasks: " + tasks);
                    }
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    String tas = scanner.nextLine();
                    for (Task task1 : manager.listTasks()) {
                        if (task1.getTitle().equals(tas)) {
                            manager.deleteTask(task1);
                        }
                    }
                    System.out.println("Deleting...");
                    break;
                case 4:
                    System.out.print("Enter task to mark: ");
                    String t = scanner.nextLine();
                    boolean marked = false;
                    for (Task task1 : manager.listTasks()) {
                        if (task1.getTitle().equals(t)) {
                            marked = true;
                            manager.markTaskAsComplete(task1);
                        }
                    }
                    if (!marked) {
                        System.out.println("Task not found");
                    }
                    break;

                case 5:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}