import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    private static final String TASK_FILE = "tasks.csv";

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String task) {
        tasks.add(task);
        saveTasks();
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
        saveTasks();
    }
    private void loadTasks() {
        try {
            if (Files.exists(Paths.get(TASK_FILE))) {
                tasks = Files.readAllLines(Paths.get(TASK_FILE));
            } else {
                Files.createFile(Paths.get(TASK_FILE));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveTasks() {
        try {
            Files.write(Paths.get(TASK_FILE), tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}