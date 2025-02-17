import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        this.tasks = new ArrayList<>(List.of());
//        String[] newlist = {};  this is what i know
    }

    ;

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public List<String> listTasks() {
        return this.tasks;
    }

    public void deleteTask(String task) {
//        leave for iteration 4
    }

    public void exit() {

        String filePath = "src/main/tasks.csv"; // File path where CSV will be saved

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String row : this.tasks) {
                writer.write(String.join(",", row));
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}