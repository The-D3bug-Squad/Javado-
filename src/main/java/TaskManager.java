import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    public File file;

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        this.file = createFile();
    }

    public File createFile() {
        try{
            File file1 = new File("tasks.csv");
            if (file1.createNewFile()){
                return file1;
            } else {
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
        // leave for iteration 2
    }
}