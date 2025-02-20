import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    public File file;

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
        file = createFile();
    }

    public File createFile(){
        File file_x = new File("tasks.csv");
        return file_x;
    }

    public void addTask(String task) {
       // throw new UnsupportedOperationException("Implement this method!");
        tasks.add(task); 
    }

    public List<String> listTasks() {
        //throw new UnsupportedOperationException("Implement this method!");
        return this.tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() throws IOException {
        // leave for iteration 2
        BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.csv"));
        for (String task : tasks){
            writer.write(String.valueOf(task));
            writer.newLine();
        }
        writer.close();
    }
}
