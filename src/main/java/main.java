import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        try
        {
            File csvFile = new File("./tests.csv");
            if (!csvFile.exists()) {
                boolean fileCreated = csvFile.createNewFile();
                if (!fileCreated)
                {
                    System.out.println("File already exists");
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Encountered an error.");
        }

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
                    System.out.print("Enter task title: ");
                    String taskTitle = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    Task task = new Task(taskTitle, taskDescription, false);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Tasks: " + manager.listTasks());
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    int tas = scanner.nextInt();
                    manager.deleteTask(manager.listTasks().get(tas));
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