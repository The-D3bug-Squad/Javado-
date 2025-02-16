import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {
    private static final String TEST_FILE = "tasks.csv";
    public static void main(String[] args) throws IOException {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

//        taskManager.addTask("Buy Groceries");
//        taskManager.addTask("Complete Assignment");
//        taskManager.exit(); // Ensure tasks are saved to file

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Tasks: " + manager.listTasks());
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    String tas = scanner.nextLine();
                    manager.deleteTask(tas);
                    System.out.println("Deleting...");
                    break;
                case 4:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}