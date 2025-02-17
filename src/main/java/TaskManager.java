import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final String TEST_FILE = "tasks.csv";  // file to store tasks
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
        File file = new File(TEST_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile(); // Creates the file if it doesn't exist
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task) {
        // leave for iteration 4
    }

    public void exit() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE));
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();  // Write each task on a new line
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
