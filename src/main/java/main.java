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

            boolean isValid = manager.processMenuChoice(choice);
            if (isValid == true) {
                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        String t = title.replaceAll("\\s", "");
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        String d = title.replaceAll("\\s", "");
                        if (t.isEmpty() || d.isEmpty()) {
                            System.out.println("Please enter a valid title and description");
                        } else {
                            Task task = new Task(title, description, false);
                            manager.addTask(task);
                        }
                        break;
                    case 2:
                        if (tasks.isEmpty()) {
                            System.out.println("There are no tasks to display.");
                        } else {
                            System.out.println("Tasks: ");
                            int count = 0;
                            for (Task task : tasks) {
                            String status = task.status ? "Completed" : "Not completed";
                                System.out.println(count+ "." + task.title + ": " + task.description + " (" + status + ")");
                                count++;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the number of the task to update status to complete: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            String status = task.status ? "Completed" : "Not completed";
                            System.out.println(i + "." + task.title + ": " + task.description + " (" + status + ")");
                        }
                        int task_no = scanner.nextInt();
                        scanner.nextLine();
                        if (task_no >= 0 && task_no <tasks.size()) {
                            Task selectedTask = tasks.get(task_no);
                            System.out.println("Updating...");
                            manager.markTaskAsComplete(selectedTask);
                        } else {
                            System.out.println("Invalid choice, please try again.");
                        }
                        break;

                    case 4:
                        System.out.println("Enter the number of the task to delete: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            String status = task.status ? "Completed" : "Not completed";
                            System.out.println(i + "." + task.title + ": " + task.description + " (" + status + ")");
                        }
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        if (num >= 0 && num <tasks.size()) {
                            System.out.println("Deleting...");
                            manager.deleteTask(tasks.get(num));
                        } else {
                            System.out.println("Invalid choice, please try again");
                        }
                        break;
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
}