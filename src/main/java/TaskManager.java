import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Exit");
            System.out.print("Please choose an option (1,2,3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your task: ");
                    String task = scanner.nextLine();
                    taskManager.addTask(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("\nTasks List:");
                    List<String> tasks = taskManager.listTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (String t : tasks) {
                            System.out.println("- " + t);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using Task Manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice,please try again.");
            }
        }
    }

    public void deleteTask(String task){
        //leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}
