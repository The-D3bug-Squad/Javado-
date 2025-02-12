import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<String> tasks; // hint: will change in iteration 3
    private final File tasksFile;

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        tasksFile = new File("tasks.csv");

        if (!tasksFile.exists()) {
            try {
                tasksFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.readTasks();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
        tasks.remove(task);

    }

    public void exit() {
        // leave for iteration 2
        this.saveTasks();
    }
    public void readTasks() {
        String line;

        try {
            assert this.tasksFile != null;
            try (BufferedReader reader = new BufferedReader(new FileReader(this.tasksFile.getPath()))) {

                while ((line = reader.readLine()) != null) {
                    tasks.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTasks() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.tasksFile.getPath()))) {

            for (String task : tasks) {
                
                writer.write(task);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
