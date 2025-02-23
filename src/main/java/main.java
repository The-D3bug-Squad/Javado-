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
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Task title: ");
                    String task_t = scanner.nextLine();
                    System.out.print("Task Details: ");
                    String task_d = scanner.nextLine();

                    Task task = new Task(task_t,task_d,false);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("Tasks: ");
                    for (Task t : manager.listTasks()) {
                        System.out.println(t.title_1 +", "+t.description_1+"\t"+"complete: "+t.isComplete());
                    }
                    break;
                case 3:
                    System.out.print("Select task to delete: ");

                    for (int i =0;i< manager.listTasks().size();i++) {
                        Task t =  manager.listTasks().get(i);
                        System.out.println((i+1)+". "+t.title_1 +"\n\t"+t.description_1+"\n\t"+"complete: "+t.isComplete()+"\n");
                    }
                    System.out.print("Task number: \n");
                    String t_number = scanner.nextLine();
                    Task t =  manager.listTasks().get(Integer.parseInt(t_number)-1);

                    manager.deleteTask(t);
                    System.out.println("Task Deleted...");
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