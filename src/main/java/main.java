import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        List<Task> tasks = manager.listTasks();

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    scanner.nextLine();
                    String t = title.replaceAll("\\s", "");
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    scanner.nextLine();
                    String d = title.replaceAll("\\s", "");
                    if (t.isEmpty() || d.isEmpty()) {
                        System.out.println("Please enter a valid title and description");
                    } else {
                        Task task = new Task(title, description, false);
                        manager.addTask(task);
                    }
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("There are no tasks to display.");
                    } else {
                        System.out.println("Tasks: " + tasks);
                    }
                case 3:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + " " + tasks.get(i));
                    }
                    System.out.print("Enter the number of the task to update status to complete: ");
                    int task_no = scanner.nextInt();
                    scanner.nextLine();
                    if (task_no >= 0 && task_no <tasks.size()) {
                        Task selectedTask = tasks.get(task_no);
                        System.out.println("Updating...");
                        manager.markTaskAsComplete(selectedTask);
                    } else {
                        System.out.println("Invalid choice, please try again.");
                    }

                case 4:
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + " " + tasks.get(i));
                    }
                    System.out.print("Enter the number of the task to delete: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    if (num >= 0 && num <tasks.size()) {
                        System.out.println("Deleting...");
                        manager.deleteTask(tasks.get(num));
                    } else {
                        System.out.println("Invalid choice, please try again");
                    }
                case 5:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}