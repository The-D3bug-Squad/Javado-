import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
       // throw new UnsupportedOperationException("Implement this method!");
        this.tasks.add(task);
    }

    public List<String> listTasks() {
        //throw new UnsupportedOperationException("Implement this method!");
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}
