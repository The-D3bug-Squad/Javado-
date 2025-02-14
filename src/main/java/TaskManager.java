import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    File fileObj = new File("tasks.csv");

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        try {
            this.fileObj.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file");
            e.printStackTrace();
        }
    }

    public void addTask(String task) {
        this.tasks.add(task);
        try {
            FileWriter fwObj = new FileWriter("tasks.csv", true);
            BufferedWriter bwObj = new BufferedWriter(fwObj);
            bwObj.write(task);
            bwObj.newLine();
            bwObj.close();
            fwObj.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }

    }

    public List<String> listTasks() { return this.tasks; }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        System.exit(0);
    }
}