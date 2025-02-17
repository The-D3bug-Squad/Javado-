import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        String filepath = "src/main/java/tasks.csv";
        try {
            if (!Files.exists(Paths.get(filepath))) {
                Files.createFile(Paths.get(filepath)); // Create file if it doesn't exist
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTask(String task) {
//        throw new UnsupportedOperationException("Implement this method!");
        this.tasks.add(task);
        String filepath = "src/main/java/tasks.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            writer.write(task);
            writer.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<String> listTasks() {
//        throw new UnsupportedOperationException("Implement this method!");
        return this.tasks;
    }
    public void deleteTask(String task){
//        leave for iteration 4
    }
    public void exit() {
        System.exit(0);
        // leave for iteration 2f
    }
}