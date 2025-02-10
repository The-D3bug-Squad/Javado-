import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        this.tasks = new ArrayList<>();
        //return this.tasks;
    }

    public void addTask(String task) {
        //this.tasks = taskManager();
        tasks.add(task);
        //throw new UnsupportedOperationException("Implement this method!");
    }

    public List<String> listTasks() {
        return tasks;
        //throw new UnsupportedOperationException("Implement this method!");
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
        try (FileWriter file = new FileWriter("tasks.txt");BufferedWriter bfile = new BufferedWriter(file)) {
            for (String task : tasks){
                bfile.write(task);
                bfile.newLine();
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}