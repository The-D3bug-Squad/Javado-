import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<>();
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
    }
}