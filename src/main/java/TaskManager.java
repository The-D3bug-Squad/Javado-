import java.util.ArrayList;
import java.util.List;
//import java.io.FileWriter;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
       this.tasks = new ArrayList<>();

    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
git















//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("tasks.txt");
//            for (String task : tasks) {
//                writer.write(task + "\n");
//            }
//            System.out.println("Tasks saved.");
//        } catch (IOException e) {
//            System.out.println("Something went wrong while saving tasks.");
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    System.out.println("Failed to close the file.");
//                }
//            }
//        }
//        System.out.println("Exiting Task Manager...");
//        System.exit(0);
    };
    }
