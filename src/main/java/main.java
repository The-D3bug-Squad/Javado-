import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;


public class main {
    public static void main(String[] args) throws IOException {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);


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
                    Task task = new Task(scanner.nextLine(), scanner.nextLine(), Boolean.valueOf(scanner.nextLine()));
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Tasks: " + manager.listTasks());
                    break;
                case 3:
                    System.out.print("Enter task to delete: ");
                    String taskTitle = scanner.nextLine();
                    Task taskToDelete = null;

                    for (Task taskItem : manager.listTasks()){
                        if (taskItem.getTitle().equals(taskTitle)){
                            taskToDelete = taskItem;
                            break;
                        }
                    }

                    if (taskToDelete != null){
                        manager.deleteTask(taskToDelete);
                        System.out.println("Deleting...");
                    } else {
                        System.out.println("Task not found");
                    }
                    break;
                case 4:
                    manager.exit();
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    manager.processMenuChoice(choice);
            }
        }
    }
}